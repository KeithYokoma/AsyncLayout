package io.github.keithyokoma.litho;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

public class MainActivity extends AppCompatActivity {
    private LithoView view;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext c = new ComponentContext(this);
        view = LithoView.create(this,
                Text.create(c).text("Hello World!")
                        .textSizeSp(20)
                        .build());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setComponentAsync(HomeComponent.create(c).build());
            }
        }, 1000L);
        setContentView(view);
    }
}
