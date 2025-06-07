package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class x0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f21597d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f21598a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21599b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21600c;

    private x0(String str, String str2) {
        this.f21598a = d(str2, str);
        this.f21599b = str;
        this.f21600c = str + "!" + str2;
    }

    static x0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new x0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f21597d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f21599b;
    }

    public String c() {
        return this.f21598a;
    }

    public String e() {
        return this.f21600c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f21598a.equals(x0Var.f21598a) && this.f21599b.equals(x0Var.f21599b);
    }

    public int hashCode() {
        return e4.o.b(this.f21599b, this.f21598a);
    }
}
