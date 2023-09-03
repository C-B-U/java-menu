## 기능 목록
- 기능 목록
- [x]  시작 메시지 출력
- [x]  코치 이름
    - [x]  코치 이름 입력 요청 메시지 출력
    - [x]  코치 이름 입력
    - [x]  콤마로 구분해 입력했는지 검증
    - [x]  코치 이름 2글자 ~ 4글자인지 검증
    - [x]  코치가 2명 이상인지 검증
    - [x]  잘못된 입력시 재입력
- [x]  코치가 못 먹는 메뉴
    - [x]  코치 못 먹는 메뉴 입력 요청 메시지 출력
    - [x]  코치 못 먹는 메뉴 입력
    - [x]  콤마로 구분해 입력했는지 검증
    - [x]  개수가 0 ~ 2개 인지 검증
    - [x]  잘못된 입력시 재입력
- [ ]  메뉴 추천
    - [ ]  이전에 먹은 음식은 못먹도록 필터링
    - [ ]  같은 카테고리 2번만 먹을 수 있도록 필터링
    - [ ]  못 먹는 음식은 추천하지 않도록 필터링
    - [ ]  랜덤으로 셔플
    - [ ]  메뉴 추천 메시지 출력
- [ ]  추천 완료 메시지 출력

## 구현 클래스 목록
- MenuController
  - start()

- ComponentFactory
  - menuController()

- OutputView
  - printStart()
  - printCoachNameRequest()

- Coach

- CoachList

- InputManager
  - readCoach()

- InputValidator
  - validateCoach()

- InputView
  - readCoach()

- MenuService
  - saveCoachList()

- MenuRepository
  - saveCoachList()
  - findCoachList()

- CoachMenu

- CoachMenuList

- CoachMenuMap

- MenuMap

## 열거형 목록
- ProgressMessage
- ErrorMessage
- Category
