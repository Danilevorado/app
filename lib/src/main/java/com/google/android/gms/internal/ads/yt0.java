package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yt0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18266a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18267b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18268c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f18269d;

    public yt0(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f18266a = q44Var;
        this.f18267b = q44Var2;
        this.f18268c = q44Var3;
        this.f18269d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ((ux0) this.f18266a).a();
        ff0 ff0VarA = ((cn0) this.f18267b).a();
        JSONObject jSONObject = (JSONObject) this.f18268c.b();
        String str = (String) this.f18269d.b();
        boolean zEquals = "native".equals(str);
        j3.t.r();
        return new jj(UUID.randomUUID().toString(), ff0VarA, str, jSONObject, false, zEquals);
    }
}
