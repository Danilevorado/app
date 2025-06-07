package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class pw2 extends qw2 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f14070c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f14071d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f14072e;

    public pw2(jw2 jw2Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(jw2Var);
        this.f14070c = new HashSet(hashSet);
        this.f14071d = jSONObject;
        this.f14072e = j10;
    }
}
