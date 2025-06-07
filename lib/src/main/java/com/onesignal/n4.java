package com.onesignal;

import com.onesignal.s3;
import org.json.JSONObject;

/* loaded from: classes.dex */
class n4 extends o4 {
    n4() {
        super(s3.c.SMS);
    }

    @Override // com.onesignal.o4, com.onesignal.p4
    protected String B() {
        return e3.r0();
    }

    @Override // com.onesignal.p4
    protected h4 O(String str, boolean z10) {
        return new m4(str, z10);
    }

    @Override // com.onesignal.p4
    void d0(String str) {
        e3.X1(str);
    }

    @Override // com.onesignal.o4
    void f0() {
        e3.N();
    }

    @Override // com.onesignal.o4
    void g0(JSONObject jSONObject) {
        e3.O(jSONObject);
    }

    @Override // com.onesignal.o4
    protected String h0() {
        return "sms_auth_hash";
    }

    @Override // com.onesignal.o4
    protected String i0() {
        return "sms_number";
    }

    @Override // com.onesignal.o4
    protected int j0() {
        return 14;
    }

    void l0(String str) {
        e3.z1(str);
    }
}
