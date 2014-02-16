package is.vidarottosson.glass.sliderview.sample;
//  Created by Viddi on 2/15/14.

import android.app.Activity;
import android.os.Bundle;

import com.google.glass.widget.SliderView;

public class MainActivity extends Activity {

    private SliderView mSliderProgress;
    private SliderView mSliderIndetermediate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSliderProgress = (SliderView) findViewById(R.id.progress_slider);
        mSliderIndetermediate = (SliderView) findViewById(R.id.indeterm_slider);

        mSliderIndetermediate.startIndeterminate();
        mSliderProgress.startProgress(10000);
    }

}
