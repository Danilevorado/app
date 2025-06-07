package com.onesignal;

import android.os.PersistableBundle;

/* loaded from: classes.dex */
class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private PersistableBundle f22126a = new PersistableBundle();

    o() {
    }

    @Override // com.onesignal.l
    public void b(String str, Long l10) {
        this.f22126a.putLong(str, l10.longValue());
    }

    @Override // com.onesignal.l
    public Integer c(String str) {
        return Integer.valueOf(this.f22126a.getInt(str));
    }

    @Override // com.onesignal.l
    public Long d(String str) {
        return Long.valueOf(this.f22126a.getLong(str));
    }

    @Override // com.onesignal.l
    public String e(String str) {
        return this.f22126a.getString(str);
    }

    @Override // com.onesignal.l
    public boolean f(String str) {
        return this.f22126a.containsKey(str);
    }

    @Override // com.onesignal.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public PersistableBundle a() {
        return this.f22126a;
    }

    @Override // com.onesignal.l
    public boolean getBoolean(String str, boolean z10) {
        return this.f22126a.getBoolean(str, z10);
    }

    @Override // com.onesignal.l
    public void putString(String str, String str2) {
        this.f22126a.putString(str, str2);
    }
}
