Google Glass Progress Bar
=========================

As of now, Google Glass GDK API has no Progress Bar view. 
So I extracted this from GlassHome.apk (from https://github.com/zhuowei/Xenologer).

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
3. Add progress bar view to your layout:

```xml
    <com.google.glass.widget.SliderView
        android:id="@+id/indeterm_slider"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true" />
```

4. Start it from activity:

```java
    mIndeterm.startIndeterminate();
    mProgress.startProgress(10 * 1000); // progress which lasts 10 seconds
```

(optional) set an AnimateListener to get notified when the animation finishes:

```java
	mSliderProgress.setOnAnimateListener(new SliderView.OnAnimateListener() {
            @Override
            public void onAnimateFinishedListener() {
                Log.i(TAG, "onFinishedListener");
            }

            @Override
            public void onAnimateCancelledListener() {
                Log.i(TAG, "onCanceledListener");
            }
        });
        mSliderProgress.startProgress(10000);
```


Disclaimer
----------

Google Glass is in Explorer Stage. That's why I tried to find the answer to this SO question http://stackoverflow.com/questions/20237873/google-glass-gdk-progress-indicator and a workaround for this issue https://code.google.com/p/google-glass-api/issues/detail?id=271

This is just for educational purposes and should not be used in any production apps until Google releases something similar officially.

I hope, Google will publish a set of Google Glass Views in the future releases of GDK. We really need them! Especially that awesome progress bar!
