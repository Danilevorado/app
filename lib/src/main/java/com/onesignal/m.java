package com.onesignal;

import android.os.Bundle;

/* loaded from: classes.dex */
class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f22108a = new Bundle();

    m() {
    }

    @Override // com.onesignal.l
    public void b(String str, Long l10) {
        this.f22108a.putLong(str, l10.longValue());
    }

    @Override // com.onesignal.l
    public Integer c(String str) {
        return Integer.valueOf(this.f22108a.getInt(str));
    }

    @Override // com.onesignal.l
    public Long d(String str) {
        return Long.valueOf(this.f22108a.getLong(str));
    }

    @Override // com.onesignal.l
    public String e(String str) {
        return this.f22108a.getString(str);
    }

    @Override // com.onesignal.l
    public boolean f(String str) {
        return this.f22108a.containsKey(str);
    }

    @Override // com.onesignal.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Bundle a() {
        return this.f22108a;
    }

    @Override // com.onesignal.l
    public boolean getBoolean(String str, boolean z10) {
        return this.f22108a.getBoolean(str, z10);
    }

    @Override // com.onesignal.l
    public void putString(String str, String str2) {
        this.f22108a.putString(str, str2);
    }
}
