# 0️⃣ 🎧 PlayListApp

### 개발 기간 2021.06.30 - 2021.07.07 (예상) 

### 개발자 [sery270](https://github.com/sery270) 

## 기능 소개 

> master 브랜치 ➡️ coroutine을 사용하여 비동기 처리

> rafactor-rx 브랜치 ➡️ rxJava를 사용하여 비동기 처리 

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
- 여기까지 과제물을 완성 ! rx로도 구현해보고 싶어서 rx 공부해서 별도의 브랜치로 업로드할 예정입니다.  

### 👩🏻‍💻 2021/07/07 수

- rxJava를 사용하여, 리펙토링도 완료 ! reafactor-rx 브랜치에 rx 버전의 과제물이 있습니다. 한편 리펙토링을 하면서 아키텍처 관련하여 느낀점이 있었습니다. (아래는 더 정리할 예정) 
  - 가장먼저, MVVM 아키텍처를 사용하면서 적절한 역할 분리를 해놓았던 점이 리펙토링 범위를 명확하게 해주는데 기여했다. View의 리펙토링 부분은 없었으며, Viewmodel의 리펙토링 부분은 있긴했지만 매우 적었다. Model를 중심으로 리펙토링이 진행되었다. 
  - Model를 리펙토링 하면서도, 클린 아키텍처를 지향하면서 적절한 추상화와 역할 분리를 해놓았던 점이, 각 요소의 의존도를 최소화해주었고, 영향을 미칠 곳을 적절히 예상할 수 있게 하여 코드 변경을 수월하게 해주었다. 
    - 예를 들어, Service를 변경하면 DS를 점검/ DS를 변경하면, Repo 점검/ Repo를 변경하면 VM 점검 하는 식으로, 즉 >>데이터의 흐름<< 의 관점으로 따라가면서 수정하게 되어 직감적으로 다가왔다. 
    - 이 과정에서 (의도한대로) Repo의 인터페이스 수정은 없었다(없어야했다). 왜냐하면, Repo의 인터페이스는 View를 위한 것으로, View는 이 Repo의 인터페이스를 통해 데이터가 어디서 오는지 몰라도 됐었기 때문이다. (이 부분이 바로 적절한 추상화로 수정범위를 줄일 수 있던 부분이었다.) Domain 레이어의 Repo의 인터페이스 수정은 VM의 수정, 즉 Presentaion 레이어의 수정으로 이어지게 한다. 
- 남은 기간엔 오디오 쪽을 건들여보려고 합니다. 

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

- coroutine과 rx 두 방식으로 네트워크 통신을 포함한 전반적인 데이터 흐름을 비동기로 처리하였다. coroutine은 멀티 스레드를 사용하지 않는데도, rx와 비슷한 속도,,(성능)을 보이는 점이 신기했다. 
  - 한편 구현하면서 동작 원리에 대해 잘 알고 있지 않으면서 프로그래밍을 하는 자신을 발견하게 되었다. 반성하게 되었다. 코드로 동작 구조를 먼저 이해하는 편이 빠르긴 하니, 코드를 많이 작성해보면서 틈틈히 개념을 보충해야겠다고 생각했다.
- 리펙토링 하면서 아키텍처와 DI의 덕을 느꼈다. 
  - MVVM은 적절한 역할 분리를 해주어, 수정시 범위를 Model에 집중할 수 있게 해주었다. 
  - Clean은 각 레이어의 의존도를 낮춰주어, 수정시의 영향도를 파악할 수 있게 해주었다. (레이어를 나눈 의도에 맞게, 수정이 필요한 부분과 아닌 부분을 구분할 수 있었다.)
  - DI는 객체 생성과 공급에 대해 고려하지 않게하여, 이와 관련하여 수정할 코드가 사라졌고, 현재 리펙토링 대상(비동기 처리 방식)에 집중할 수 있었다. 
> 생각나는 부분은  계속 추가할 예정 

