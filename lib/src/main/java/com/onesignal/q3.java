package com.onesignal;

import com.onesignal.p3;
import org.json.JSONObject;

/* loaded from: classes.dex */
class q3 implements f3 {

    class a extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h3 f22263a;

        a(h3 h3Var) {
            this.f22263a = h3Var;
        }

        @Override // com.onesignal.p3.g
        public void a(int i10, String str, Throwable th) {
            this.f22263a.b(i10, str, th);
        }

        @Override // com.onesignal.p3.g
        public void b(String str) {
            this.f22263a.a(str);
        }
    }

    q3() {
    }

    @Override // com.onesignal.f3
    public void a(String str, JSONObject jSONObject, h3 h3Var) throws InterruptedException {
        p3.j(str, jSONObject, new a(h3Var));
    }
}
