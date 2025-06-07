package com.onesignal;

import com.onesignal.s3;
import org.json.JSONObject;

/* loaded from: classes.dex */
class j4 extends o4 {
    j4() {
        super(s3.c.EMAIL);
    }

    @Override // com.onesignal.o4, com.onesignal.p4
    protected String B() {
        return e3.c0();
    }

    @Override // com.onesignal.p4
    protected h4 O(String str, boolean z10) {
        return new i4(str, z10);
    }

    @Override // com.onesignal.p4
    void d0(String str) {
        e3.W1(str);
    }

    @Override // com.onesignal.o4
    void f0() {
        e3.J();
    }

    @Override // com.onesignal.o4
    void g0(JSONObject jSONObject) {
        e3.K();
    }

    @Override // com.onesignal.o4
    protected String h0() {
        return "email_auth_hash";
    }

    @Override // com.onesignal.o4
    protected String i0() {
        return "email";
    }

    @Override // com.onesignal.o4
    protected int j0() {
        return 11;
    }

    void l0(String str) {
        e3.y1(str);
    }
}
