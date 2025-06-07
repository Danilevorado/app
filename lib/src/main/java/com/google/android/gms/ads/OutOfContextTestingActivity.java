package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.l30;
import d3.q;
import d3.r;
import k3.f2;
import k3.t;
import l4.b;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f2 f2VarF = t.a().f(this, new l30());
        if (f2VarF == null) {
            finish();
            return;
        }
        setContentView(r.f22864a);
        LinearLayout linearLayout = (LinearLayout) findViewById(q.f22863a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            f2VarF.Q4(stringExtra, b.p1(this), b.p1(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
