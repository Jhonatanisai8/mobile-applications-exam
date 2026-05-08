# Partial Exam 1 — Mobile Application Programming

This repo holds the three Android projects developed for the first partial exam of the Mobile Application Programming course (Unit 1, Session 05). Each one tackles a different exercise and builds on top of skills learned throughout the unit.

---

## Projects

### Exercise 1 — `examenej1`

A basic Android app created from the default template. It opens a single screen with a "Hello World!" message centered on the screen. Nothing fancy — it's the foundation for getting familiar with the project structure and how Android Studio sets things up.

**Screens:** 1 (main screen only)

**Key things it uses:**
- `ConstraintLayout` to position the text in the center
- `EdgeToEdge` support so the content sits properly behind the system bars (status bar, nav bar)

---

### Exercise 2 — `examenej2` · *Platos App*

A two-screen app for browsing food dishes. The first screen shows a list of plates, and tapping on one takes you to a detail screen with more info about that dish.

> **Note:** The source files for this project are not in the repo (likely not committed), but the compiled APK (`PlatosEX2.apk`) is present in the build folder.

**Screens:**
- `MainActivity` — list of food plates
- `DetalleComidaActivity` — detail view for the selected plate

---

### Exercise 3 — `examenej3`

A multi-screen app with a login flow. The user enters a username and password on the main screen. If the credentials match, they're taken to a teacher profile screen; from there, they can navigate to an activities screen where buttons trigger different actions. There's also a button to close the whole app.

**Screens:**
- `MainActivity` — login screen (username: `Larroyo`, password: `UCV`)
- `DocenteActivity` — teacher's welcome screen with a button to continue
- `ActividadesActivity` — screen with two activity buttons and a quit button

**Key things it uses:**
- `Intent` to move between screens
- `Toast` messages to give feedback when buttons are tapped
- `finishAffinity()` to close all screens at once when quitting

---

## How to open and run any of these

1. Open **Android Studio**.
2. Choose **Open** and navigate into the project folder you want (`examenej1`, `examenej2`, or `examenej3`).
3. Wait for Gradle to sync — it happens automatically.
4. Connect an Android device or start an emulator.
5. Press the **Run** button (the green play icon).

---

## Course info

| Field    | Value                          |
|----------|--------------------------------|
| Course   | Mobile Application Programming |
| Unit     | 1                              |
| Session  | 05                             |
| Exam     | Partial Exam 1                 |
| Language | Java                           |
| Platform | Android                        |
