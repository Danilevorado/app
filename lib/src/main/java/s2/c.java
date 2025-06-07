package s2;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26741a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.a f26742b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.a f26743c;

    /* renamed from: d, reason: collision with root package name */
    private final String f26744d;

    c(Context context, b3.a aVar, b3.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f26741a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f26742b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f26743c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f26744d = str;
    }

    @Override // s2.h
    public Context b() {
        return this.f26741a;
    }

    @Override // s2.h
    public String c() {
        return this.f26744d;
    }

    @Override // s2.h
    public b3.a d() {
        return this.f26743c;
    }

    @Override // s2.h
    public b3.a e() {
        return this.f26742b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f26741a.equals(hVar.b()) && this.f26742b.equals(hVar.e()) && this.f26743c.equals(hVar.d()) && this.f26744d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f26741a.hashCode() ^ 1000003) * 1000003) ^ this.f26742b.hashCode()) * 1000003) ^ this.f26743c.hashCode()) * 1000003) ^ this.f26744d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f26741a + ", wallClock=" + this.f26742b + ", monotonicClock=" + this.f26743c + ", backendName=" + this.f26744d + "}";
    }
}
