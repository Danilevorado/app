package com.pushwoosh.inapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import n7.l;

/* loaded from: classes2.dex */
public abstract class c extends Activity implements u9.a {

    /* renamed from: m, reason: collision with root package name */
    private int f22597m;

    /* renamed from: n, reason: collision with root package name */
    protected q9.b f22598n;

    /* renamed from: o, reason: collision with root package name */
    protected String f22599o;

    /* renamed from: p, reason: collision with root package name */
    protected String f22600p;

    /* renamed from: q, reason: collision with root package name */
    private g f22601q;

    protected static Intent b(Intent intent, q9.b bVar, String str, int i10) {
        intent.putExtra("extraInApp", bVar);
        intent.putExtra("extraSound", str);
        intent.putExtra("extraMode", i10);
        intent.putExtra("richMediaCode", !bVar.t() ? bVar.l().substring(2) : "");
        intent.putExtra("inAppCode", bVar.t() ? bVar.l() : "");
        intent.addFlags(!bVar.v() ? 805306368 : 268435456);
        return intent;
    }

    private void d(Intent intent) {
        g gVar;
        q9.b bVar = this.f22598n;
        boolean z10 = bVar != null && bVar.equals(intent.getSerializableExtra("extraInApp"));
        if (!z10 || this.f22601q == null) {
            try {
                boolean zIsInMultiWindowMode = Build.VERSION.SDK_INT >= 24 ? isInMultiWindowMode() : false;
                ma.c cVarE = l.i().k().e();
                if (z10) {
                    g gVar2 = new g(this, this.f22598n.o(), cVarE, zIsInMultiWindowMode);
                    this.f22601q = gVar2;
                    gVar2.setWebViewClient(new u9.e(this, this.f22598n));
                    if (gVar != null) {
                        return;
                    } else {
                        return;
                    }
                }
                q9.b bVar2 = (q9.b) intent.getSerializableExtra("extraInApp");
                this.f22598n = bVar2;
                if (bVar2 == null) {
                    finish();
                    g gVar3 = this.f22601q;
                    if (gVar3 != null) {
                        i(gVar3);
                        return;
                    }
                    return;
                }
                this.f22599o = intent.getStringExtra("richMediaCode");
                this.f22600p = intent.getStringExtra("inAppCode");
                String stringExtra = intent.getStringExtra("extraSound");
                this.f22597m = intent.getIntExtra("extraMode", 0);
                g gVar4 = new g(this, this.f22598n.o(), cVarE, zIsInMultiWindowMode);
                this.f22601q = gVar4;
                gVar4.setWebViewClient(new u9.e(this, this.f22598n));
                j(this.f22598n, stringExtra, this.f22597m);
                g gVar5 = this.f22601q;
                if (gVar5 != null) {
                    i(gVar5);
                }
            } finally {
                gVar = this.f22601q;
                if (gVar != null) {
                    i(gVar);
                }
            }
        }
    }

    public void c() {
        g gVar = this.f22601q;
        if (gVar != null) {
            gVar.k();
        }
    }

    public void close() {
        g gVar = this.f22601q;
        if (gVar != null) {
            gVar.i();
            this.f22601q = null;
        }
        finish();
    }

    @Override // u9.a
    public int f() {
        return this.f22597m;
    }

    protected abstract void i(g gVar);

    protected abstract void j(q9.b bVar, String str, int i10);

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getAttributes().flags |= Integer.MIN_VALUE;
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (bundle != null) {
            this.f22598n = (q9.b) bundle.getSerializable("extraInApp");
        }
        d(getIntent());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f22601q = null;
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extraInApp", this.f22598n);
    }
}
