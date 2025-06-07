package androidx.lifecycle;

import androidx.lifecycle.j;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements l {

    /* renamed from: a, reason: collision with root package name */
    private final f f3060a;

    /* renamed from: b, reason: collision with root package name */
    private final l f3061b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3062a;

        static {
            int[] iArr = new int[j.b.values().length];
            f3062a = iArr;
            try {
                iArr[j.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3062a[j.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3062a[j.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3062a[j.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3062a[j.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3062a[j.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3062a[j.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(f fVar, l lVar) {
        this.f3060a = fVar;
        this.f3061b = lVar;
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) {
        switch (a.f3062a[bVar.ordinal()]) {
            case 1:
                this.f3060a.c(nVar);
                break;
            case 2:
                this.f3060a.f(nVar);
                break;
            case 3:
                this.f3060a.a(nVar);
                break;
            case 4:
                this.f3060a.e(nVar);
                break;
            case 5:
                this.f3060a.g(nVar);
                break;
            case 6:
                this.f3060a.b(nVar);
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        l lVar = this.f3061b;
        if (lVar != null) {
            lVar.d(nVar, bVar);
        }
    }
}
