___

## ASSIGNMENT 01 (A01)

- [x] TASK 01: Chrome Driver (Google - Title & URL)
- [x] TASK 02: Firefox Driver (YouTube - Verify Title)
- [x] TASK 03: Window Commands (Position & Size)
- [x] TASK 04: Window Commands (Max/Min/Fullscreen)

---
## A02BrowserHistory

- [x] @BeforeEach → setup() (Chrome, maximize)
- [x] @Test → navTest()
    - Wikipedia → Google
    - Back/Forward multiple times → assert titles
- [x] @Test → refreshTest()
    - Refresh Google → title still contains `"Google"`
- [x] @AfterEach → tearDownAll() (quit)

---

## A03SourceTest

- [x] @BeforeEach → setup() (Chrome, maximize)
- [x] @Test → source contains `"WebDriver"` (selenium.dev)
- [x] @Test → source contains `"Python"` (python.org)
- [x] @AfterEach → teardown() (quit)

---

## A04SizePos

- [x] @BeforeEach → setup() (Chrome)
- [x] @Test → sizeTest() → set size (800 × 600) → `assertEquals` width & height
- [x] @Test → positionTest() → set position (100, 100) → `assertEquals` X & Y
- [x] @AfterEach → teardown() (quit)

---

## A05NavVerify

- [x] @BeforeEach → setup() (Chrome, maximize)
- [x] @Test → navTitleVerifyTest()
    - Google → `Assertions.assertTrue` title contains `"Google"`
    - YouTube → `Assertions.assertTrue` title contains `"YouTube"`
    - LinkedIn → `Assertions.assertTrue` title contains `"LinkedIn"`
- [x] @Test → navUrlVerifyTest()
    - Back twice → `Assertions.assertEquals` URL `"https://www.google.com/"`
    - Forward twice → `Assertions.assertEquals` URL `"https://www.linkedin.com/"`
- [x] @AfterAll → close() (quit)

---


## MonitoringJUnit01

- [x] @BeforeAll → setUp()
- [x] @BeforeEach → beforeEach()
- [x] @Test → currentURL contains "youtube"
- [x] @Test → title does not contain "Video"
- [x] @Test → URL contains "youtube"
- [x] @Test → sourcePage contains "youtube"
- [x] @AfterEach → afterEach()
- [x] @AfterAll → close()

---

## MonitoringJUnit02

- [x] @BeforeEach → beforeEach()
- [x] @Test → title same (maximize vs minimize)
- [x] @Test → title not contain "Video" (fullscreen)
- [x] @Test → URL contains "google"
- [x] @AfterEach → afterEach()

---