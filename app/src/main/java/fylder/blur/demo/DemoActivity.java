package fylder.blur.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fivehundredpx.android.blur.BlurringView;

public class DemoActivity extends AppCompatActivity {


    private BlurringView mBlurringView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        initBlur();
    }

    void initBlur() {
        mBlurringView = (BlurringView) findViewById(R.id.blurring_view);
        if (mBlurringView != null) {
            View blurredView = findViewById(R.id.blur_view2);
            mBlurringView.setBlurredView(blurredView);  //模糊内容
            mBlurringView.invalidate(); //开始处理
        }
    }
}
