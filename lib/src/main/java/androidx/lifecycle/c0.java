package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.g0;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class c0 extends g0.d implements g0.b {

    /* renamed from: b, reason: collision with root package name */
    private Application f3105b;

    /* renamed from: c, reason: collision with root package name */
    private final g0.b f3106c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f3107d;

    /* renamed from: e, reason: collision with root package name */
    private j f3108e;

    /* renamed from: f, reason: collision with root package name */
    private t0.c f3109f;

    public c0(Application application, t0.e eVar, Bundle bundle) {
        rb.h.e(eVar, "owner");
        this.f3109f = eVar.c();
        this.f3108e = eVar.s();
        this.f3107d = bundle;
        this.f3105b = application;
        this.f3106c = application != null ? g0.a.f3124f.b(application) : new g0.a();
    }

    @Override // androidx.lifecycle.g0.b
    public f0 a(Class cls) {
        rb.h.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.g0.b
    public f0 b(Class cls, n0.a aVar) throws SecurityException {
        rb.h.e(cls, "modelClass");
        rb.h.e(aVar, "extras");
        String str = (String) aVar.a(g0.c.f3133d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(z.f3180a) == null || aVar.a(z.f3181b) == null) {
            if (this.f3108e != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(g0.a.f3126h);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorC = d0.c(cls, (!zIsAssignableFrom || application == null) ? d0.f3111b : d0.f3110a);
        return constructorC == null ? this.f3106c.b(cls, aVar) : (!zIsAssignableFrom || application == null) ? d0.d(cls, constructorC, z.a(aVar)) : d0.d(cls, constructorC, application, z.a(aVar));
    }

    @Override // androidx.lifecycle.g0.d
    public void c(f0 f0Var) {
        rb.h.e(f0Var, "viewModel");
        j jVar = this.f3108e;
        if (jVar != null) {
            LegacySavedStateHandleController.a(f0Var, this.f3109f, jVar);
        }
    }

    public final f0 d(String str, Class cls) throws SecurityException, IOException {
        f0 f0VarD;
        Application application;
        rb.h.e(str, "key");
        rb.h.e(cls, "modelClass");
        if (this.f3108e == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorC = d0.c(cls, (!zIsAssignableFrom || this.f3105b == null) ? d0.f3111b : d0.f3110a);
        if (constructorC == null) {
            return this.f3105b != null ? this.f3106c.a(cls) : g0.c.f3131b.a().a(cls);
        }
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(this.f3109f, this.f3108e, str, this.f3107d);
        if (!zIsAssignableFrom || (application = this.f3105b) == null) {
            y yVarI = savedStateHandleControllerB.i();
            rb.h.d(yVarI, "controller.handle");
            f0VarD = d0.d(cls, constructorC, yVarI);
        } else {
            rb.h.b(application);
            y yVarI2 = savedStateHandleControllerB.i();
            rb.h.d(yVarI2, "controller.handle");
            f0VarD = d0.d(cls, constructorC, application, yVarI2);
        }
        f0VarD.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return f0VarD;
    }
}
