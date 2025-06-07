package com.onesignal;

import android.content.ComponentName;
import android.net.Uri;
import n.d;

/* loaded from: classes.dex */
abstract class j3 {

    private static class a extends n.e {

        /* renamed from: n, reason: collision with root package name */
        private String f22089n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f22090o;

        a(String str, boolean z10) {
            this.f22089n = str;
            this.f22090o = z10;
        }

        @Override // n.e
        public void a(ComponentName componentName, n.c cVar) {
            cVar.e(0L);
            n.f fVarC = cVar.c(null);
            if (fVarC == null) {
                return;
            }
            Uri uri = Uri.parse(this.f22089n);
            fVarC.f(uri, null, null);
            if (this.f22090o) {
                n.d dVarA = new d.a(fVarC).a();
                dVarA.f25427a.setData(uri);
                dVarA.f25427a.addFlags(268435456);
                e3.f21882e.startActivity(dVarA.f25427a, dVarA.f25428b);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private static boolean a() {
        return true;
    }

    protected static boolean b(String str, boolean z10) {
        if (!a()) {
            return false;
        }
        return n.c.a(e3.f21882e, "com.android.chrome", new a(str, z10));
    }
}
