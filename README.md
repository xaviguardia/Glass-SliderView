Google Glass SliderView
=========================

This is a remake from https://github.com/pif/glass-progress-bar.
The difference between the two is that this project was made with Android Studio and Gradle, and has an additional listener for when the animation of the SliderView has completed (see below).

As of right now, Google Glass GDK does not have any ProgressBar. This SliderView widget was extracted from GlassHome.apk (https://github.com/zhuowei/Xenologer)

<p align="center">
    <img src="http://i.imgur.com/5KsQKDs.gif">
</p>


Features
--------

1. Progress bar, which is used by all native apps.
2. Supports default progress.
3. Supports indeterminate progress.


Usage
-----

1. Add this library project to your project.
2. (optional) override progress bar height in your own `res/values/dimens.xml` --> `<dimen name="slider_bar_height">12.0px</dimen>`
3. Add progress bar view to your layout

```xml
    <com.google.glass.widget.SliderView
        android:id="@+id/indeterm_slider"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true" />
```
Start it from activity:

```java
    mSliderIndetermediate.startIndeterminate();
    mSliderProgress.startProgress(10000); // progress which lasts 10 seconds
```

(optional) set an AnimateListener to get notified when the animation finishes:

```java
	mSliderProgress.setOnAnimateListener(new SliderView.OnAnimateListener() {
            @Override
            public void onAnimateFinishedListener() {
            
            }

            @Override
            public void onAnimateCancelledListener() {
            
            }
        });
        mSliderProgress.startProgress(10000);
```
