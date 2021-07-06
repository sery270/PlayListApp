# 0️⃣ 🎧 PlayListApp

### 개발 기간 2021.06.30 - 2021.07.07 (예상) 

### 개발자 [sery270](https://github.com/sery270) 

## 기능 소개 

> 앱 완성 후 화면과 함께 업데이트 예정 ! 

## 개발일지 

### 👩🏻‍💻 2021/06/30 수

- 프로젝트 기반 구축 작업을 했습니다. base 폴더의 내용들을 작성했습니다.
  - BindingActivity/ BindingFragment/ BindingAdapter/ BaseResponse
- 전달받은 리소스를 import 하고, 화면을 구성하기 위한 뷰를 그렸습니다. xml 파일들을 작성했습니다.
- gradle kotlin DSL 적용했습니다. 가독성이 좋고, 코드를 작성할때 IDE 상에서 지원해주는 기능들(자동완성, 오류표시 등등)을 사용할 수 있어 편합니다. 또한 이에 필요한 Version, Depensencies 정보를 별도의 모듈로 분리하여 관리하였습니다. 
  - BuildSrc 모듈 만들어, 버전관리와 의존성 관리하는 파일을 build.gradle과 분리했습니다.
  - build.gradle.kts 작성 

### 👩🏻‍💻 2021/07/01 목

- 클린 아키텍처의 구조를 도입하여, 각 구성요소들이 사용하는 데이터를 중심으로 3가지 레이어로 나누어보았습니다. Presentation/ Data/ Domain 레이어로 나눠, 각 레이어들의 기본적인 클래스들을 작성하였습니다. 
  - Data layer
    - DataSource
    - DataSourceImpl
    - RepositoryImpl
    - Service (API 통신)
    - ServiceResponse (API 통신 응답)
  - Domain layer
    - Repository
    - Entity 
  - Presentation layer
    - Fragment
    - Adapter
    - Viewmodel
- 더 간편한 유지보수와 보일러플레이트 코드를 줄이기 위해 DI를 적용하였습니다. 안드로이드 전용 DI 라이브러리인 Hilt를 사용하여, 함수와 어노테이션으로 객체 주입의 주체와 대상을 정의하고, 지정된 Component에 따라 자동으로 수명 주기를 관리해줄 수 있어 사용하였습니다. 거의 모든 DI 모듈에 SingletonComponent를 사용하였는데, Application 생명주기에 따라야한다고 생각했기 때문입니다. (더 작은 생명주기에서도 가능한지는 공부가 더 필요한 부분.)
  - RepositoryModule/ DataSourceModule
- 뷰 관련된 클래스들에서의 보일러플레이트 코드를 줄이고, 더 간편한 유지보수를 하기위해 데이터바인딩을 적용하였습니다. 

### 👩🏻‍💻 2021/07/02 금

- API 통신 작업을하였습니다. Data layer에선, API 통신에 대한 정의인 Service와 이를 처리하는 DataSource를 작성하였습니다. 
  - Service - DataSource - Repository - Viewmodel 까지의 데이터 흐름을 코루틴을 활용하여, 비동기로 처리하였습니다. 
    - 다음주에 Rx로 구현할 예정입니다. 
- Presentation layer에선, Adapter를 구현하고 Viewmodel을 수정하였습니다. 
  - DiffUtil을 사용하여 성능을 향상시키기 위해, ListAdapter를 사용하여 RecyclerView의 Adapter를 구현했습니다. 
- 요구사항에 맞체 뷰를 수정했습니다. xml 파일을 수정했습니다. (theme, ellipsize)

### 👩🏻‍💻 2021/07/05 월

- Glide와 databinding을 사용하여 이미지를 처리했습니다. 
- rx 공부를 했습니다. 
- 지금까지의 결과물 정리했습니다. 

### 👩🏻‍💻 2021/07/06 화

- 각 음악 아이템에 대하여, 클릭 리스너를 달았습니다. 이 과정에서 navigation과 databinding을 활용하였습니다. 
  - navigation의 action을 활용하면서, 화면전환시에 애니메이션을 추가하였습니다. 
- 여기까지 과제물을 완성하긴 했는데, rx로도 구현해보고 싶어서 rx 공부해서 별도의 브랜치로 업로드할 예정 


# 1️⃣ 개발환경

## Kotlin 1.5.10

## Android Studio 4.2.1

## MVVM/Clean Architecture 

## Open Source Library

| 라이브러리                                                   | 목적/이유                                              |
| ------------------------------------------------------------ | ------------------------------------------------------ |
| [Hilt](https://developer.android.com/jetpack/androidx/releases/hilt) | 의존성 주입(DI)을 위해 안드로이드 전용 라이브러리 사용 |
| [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation) | Fragment간 화면 전환 및 싱글 액티비티 구조를 위해 사용 |
| [Gson](https://github.com/google/gson)                       | Convert Java Objects into JSON representation          |
| [Glide](https://github.com/bumptech/glide)                   | Image Load Library                                     |
| [Retrofit](https://square.github.io/retrofit/)               | A type-safe HTTP client for Android and Java           |
| Timber                                                       | 로그를 간단하게 작성하고, 관리하기 위해 사용           |
| AAC (ViewModel/ Livedata/DataBinding)                        | MVVM Architecture 구성하기 위해 사용                   |
| RecyclerView/ ListAdapter                                    | DiffUtil을 사용하여, 성능을 향상시키기 위해 사용       |
| ktLint                                                       | Kotlin 코딩 컨벤션을 유지하기 위해 사용                |

# 2️⃣ conventions

[PlayListApp 프로젝트 conventions](https://github.com/sery270/PlayListApp/blob/master/DOCS/conventions.md)

# 3️⃣ 마무리

>  추후 업데이트 예정

