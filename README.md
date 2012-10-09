# Page Curl for Android
## Overview
The android-page-curl is a 2D View which simulates a page curl effect. Without OpenGL, only the android canvas has been used, so that it can be used in any version of Android!

## Showcase
### Page Turner
The synchronizing e-reader for Android.

[Page Turner](http://www.pageturner-reader.org/) is an open-source e-book reader for Android that allows you to synchronize your reading progress across devices. This means you can read a few pages on your phone and then grab your tablet and pick up on the exact spot you left off on your phone. Grab quick reading moments anywhere, anytime.

[Page Turner](http://www.pageturner-reader.org/) does not use the android-page-curl out of the box, they transformed it into an animator class! It's a great reader and of course all open-source!

## Demo
Have a look at the [demo video](http://www.youtube.com/watch?v=aVZHN_o45sg).

## Live Demo
android-page-curl has been added to the [ Android UI Patterns](https://market.android.com/details?id=com.groidify.uipatterns) app.

## Current State
By now it just switches between 2 images. But the idea is to render any view to animage and using two (foregound and background) images to create the effect. In some thime the flipper will inherit from ViewGroup? instead if View so that content providers and adapters will be able to add views to it.