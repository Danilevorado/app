package f8;

import a9.g;

/* loaded from: classes2.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final q9.b f23660a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC0130a f23661b;

    /* renamed from: f8.a$a, reason: collision with other inner class name */
    public enum EnumC0130a {
        DOWNLOADING_ZIP,
        DOWNLOADED_ZIP,
        DEPLOYED,
        DEPLOY_FAILED
    }

    public a(EnumC0130a enumC0130a, q9.b bVar) {
        this.f23661b = enumC0130a;
        this.f23660a = bVar;
    }

    public String a() {
        return this.f23660a.l();
    }

    public EnumC0130a b() {
        return this.f23661b;
    }
}
