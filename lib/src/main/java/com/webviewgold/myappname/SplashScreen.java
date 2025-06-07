package com.webviewgold.myappname;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.ads.R;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public class SplashScreen extends androidx.appcompat.app.c {
    private static SplashScreen N;
    private GifImageView M;

    public static SplashScreen d0() {
        return N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0() {
        finish();
        overridePendingTransition(0, 0);
    }

    private void f0() {
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT > 33 && getResources().getConfiguration().orientation == 2) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(getResources().getColor(R.color.colorWhite));
            getWindow().setBackgroundDrawable(new BitmapDrawable(getResources(), bitmapCreateBitmap));
        }
        setContentView(R.layout.splash_screen);
        N = this;
        if (e.f22739f) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        getWindow().addFlags(128);
        this.M = (GifImageView) findViewById(R.id.splash);
        try {
            f0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.M.setVisibility(8);
        new Handler().postDelayed(new Runnable() { // from class: com.webviewgold.myappname.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f22783m.e0();
            }
        }, 0L);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }
}
