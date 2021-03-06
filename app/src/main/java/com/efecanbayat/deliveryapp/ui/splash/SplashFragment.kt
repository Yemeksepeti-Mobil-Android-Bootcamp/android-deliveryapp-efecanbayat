package com.efecanbayat.deliveryapp.ui.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.auth0.android.jwt.JWT
import com.efecanbayat.deliveryapp.R
import com.efecanbayat.deliveryapp.data.local.SharedPrefManager
import com.efecanbayat.deliveryapp.databinding.FragmentSplashBinding
import com.efecanbayat.deliveryapp.ui.MainActivity

class SplashFragment: Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.splashAnimation.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
                Log.v("Splash","Animation Started")
            }

            override fun onAnimationEnd(animation: Animator?) {
                val token = getToken()

                if (!isOnboardingSeen()){
                    findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
                }else{
                    if (token.isNullOrEmpty()){
                        findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
                    }else{
                        val jwt = JWT(token)

                        if (jwt.isExpired(0)) {
                            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
                        }else{
                            val intent = Intent(context, MainActivity::class.java)
                            startActivity(intent)
                            requireActivity().finish()
                        }

                    }
                }

            }

            override fun onAnimationCancel(animation: Animator?) {
                Log.v("Splash","Animation Canceled")
            }

            override fun onAnimationRepeat(animation: Animator?) {
                Log.v("Splash","Animation Repeated")
            }

        })
    }

    private fun isOnboardingSeen(): Boolean {
        return SharedPrefManager(requireContext()).isOnboardingSeen()
    }

    private fun getToken(): String? {
        return SharedPrefManager(requireContext()).getToken()
    }

}