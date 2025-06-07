package com.webviewgold.myappname;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.ads.R;
import com.webviewgold.myappname.b;

@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes2.dex */
public class SplashScreenActivity extends b {

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SplashScreenActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(View view) {
        i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        String string;
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        overridePendingTransition(0, 0);
        intent.setFlags(65536);
        if (getIntent().getExtras() != null && (string = getIntent().getExtras().getString("url")) != null && !string.isEmpty()) {
            intent.putExtra("ONESIGNAL_URL", string);
        }
        intent.putExtra(MainActivity.T0, true);
        startActivity(intent);
        if (Build.VERSION.SDK_INT <= 33) {
            overridePendingTransition(0, 0);
            new Handler().postDelayed(new a(), 30L);
        }
    }

    private void i0() {
        super.c0(new b.c() { // from class: com.webviewgold.myappname.v
            @Override // com.webviewgold.myappname.b.c
            public final void a() {
                this.f22785a.h0();
            }

            @Override // com.webviewgold.myappname.b.c
            public /* synthetic */ void b(int i10, CharSequence charSequence) {
                c.a(this, i10, charSequence);
            }
        });
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        b0.c.c(this);
        super.onCreate(bundle);
        setContentView(R.layout.splash_screen);
        int i10 = Build.VERSION.SDK_INT;
        if (e.f22739f) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        if (i10 > 33 && getResources().getConfiguration().orientation == 2) {
            if (d.f22733a.booleanValue()) {
                Log.d("TAG", "onCreate: RUN");
            }
            getWindow().getDecorView().setSystemUiVisibility(3328);
        }
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorWhite));
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorWhite));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.btnUnlock);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.webviewgold.myappname.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22784m.g0(view);
            }
        });
        if (e.f22740g) {
            constraintLayout.setVisibility(0);
            i0();
        } else {
            constraintLayout.setVisibility(8);
            new Handler().postDelayed(new Runnable() { // from class: com.webviewgold.myappname.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22786m.h0();
                }
            }, 1500L);
        }
    }
}
