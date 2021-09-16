# BitApp

An android app that showing the details of the currency pair, at real-time:

- a list of Currency Pairs
- a real time trade details for selected Currency pair

---

### MVVM pattern with Clean architecture developed with Kotlin.

Clean architecture consists of three layers:

- **Data**, includes data objects, databases, network clients, repositories.
- **Domain**, includes use cases of business logic. This layer orchestrates the flow of data from
  Data Layer to Presentation and the other way.
- **Presentation**, includes UI related components, such as ViewModels, Fragments, Activities.

Each layer has its own entities/models which are specific to that package. Mapper is used for
conversion of one layer to another.

##### Android Jetpack Components used:

- Activity
- Compose
- ViewModel
- StateFlow
- Navigation Graph
- ViewModel Scope, Coroutines

##### Libraries:

androidGradle = "7.0.2"  
kotlinGradle = "1.5.21"  
kotlin = "1.4.31"  
constraintLayout = "2.0.0-beta4"  
coroutines = "1.4.2"  
support = "1.1.0"  
coreKtx = "1.1.0"  
navigation = "2.2.0"  
lifecycle = "2.4.0-alpha01"  
testing = "2.1.0"  
room = "2.2.3"  
retrofit = "2.9.0"  
retrofitLogInterceptor = "5.0.0-alpha.2"  
scarlet = "0.1.12"  
moshi = "1.12.0"  
glide = "4.11.0"  
junit = "4.12"  
testRunner = "1.1.0"  
espresso = "3.1.1"  
material = "1.1.0-beta02"  
mockito = "3.2.4"  
mockitoKotlin = "2.1.0"  
truth = "1.0.1"  
viewpager2 = "1.0.0"  
hilt = "2.38.1"  
hiltJetpack = "1.0.0-alpha03"  
compose_version = "1.0.2"

##### Screenshots:
![Screenshot 2021-09-16 130822](Screenshot%202021-09-16%20130822.png)  
![Screenshot 2021-09-16 131019](Screenshot%202021-09-16%20131019.png)
