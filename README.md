# Yemeksepeti Mobile Android Bootcamp Final Project.


## About this project

This project is a food delivery application. In this project I learned the most used structures in android applications.

## Used Technologies

* MVVM Architecture
* Retrofit, okHttp
* Dagger Hilt
* Kotlin Coroutine
* ViewModel - LiveData
* Gson
* Lottie Animations
* RecyclerView
* Fragments
* Room
* JWT Decode

## Project Structure
------
* Splash Screen
* Onboarding Screens
* Login Screen
* Register Screen
* Home Screen
* Add Restaurant Screen
* Restaurant Detail Screen
* Add Food Screen
* Food Detail Screen
* Order Basket Screen
* Profile Screen
* Update User Screen
* Last Orders Screen

### Screen Usage
-----

#### Splash, Onboarding, Login Screens
-----

<img src="./gifs/login.gif" height="600px" width="300px"/>

#### Home Screen
-----

* When the application is opened again check the token exist or not if it doesn't exist navigate to login screen
* Jwt Decode checks the token is expired or not if it expired navigate to login screen
* Restaurant List
* Restaurants can be search by name and district
* Restaurants can be filtered by category

<img src="./gifs/home_screen.gif" height="600px" width="300px"/>

#### Restaurant Add Screen
-----

* Add button only appears for admin users

<img src="./gifs/restaurant_add.gif" height="600px" width="300px"/>

#### Food Add Screen
-----

* Add button only appears for admin users

<img src="./gifs/food_add.gif" height="600px" width="300px"/>

#### Order Card Screen, Last Orders Screen
-----

* Clear button clears the basket
* Order button send orders to last orders at profile screen

<img src="./gifs/order.gif" height="600px" width="300px"/>

#### Profile, Update User
-----

<img src="./gifs/profile.gif" height="600px" width="300px"/>

## Acknowledgements

- Kodluyoruz Yemeksepeti Android Bootcamp
- Patika.dev 
- [Erol Kaftanoğlu](https://github.com/erolkaftanoglu)
