package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.d70;
import com.google.android.gms.internal.ads.ze0;
import k3.t;
import l4.b;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: m, reason: collision with root package name */
    private d70 f5525m;

    private final void a() {
        d70 d70Var = this.f5525m;
        if (d70Var != null) {
            try {
                d70Var.D();
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.N4(i10, i11, intent);
            }
        } catch (Exception e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                if (!d70Var.z()) {
                    return;
                }
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        super.onBackPressed();
        try {
            d70 d70Var2 = this.f5525m;
            if (d70Var2 != null) {
                d70Var2.g();
            }
        } catch (RemoteException e10) {
            ze0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.R(b.p1(configuration));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d70 d70VarK = t.a().k(this);
        this.f5525m = d70VarK;
        if (d70VarK != null) {
            try {
                d70VarK.S2(bundle);
                return;
            } catch (RemoteException e5) {
                e = e5;
            }
        } else {
            e = null;
        }
        ze0.i("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.l();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.m();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.Y0(i10, strArr, iArr);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.o();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.q();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.f0(bundle);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.t();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.B();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            d70 d70Var = this.f5525m;
            if (d70Var != null) {
                d70Var.u();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
