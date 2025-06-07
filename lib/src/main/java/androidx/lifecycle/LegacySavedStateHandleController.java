package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.j;
import java.util.Iterator;
import t0.c;

/* loaded from: classes.dex */
abstract class LegacySavedStateHandleController {

    static final class a implements c.a {
        a() {
        }

        @Override // t0.c.a
        public void a(t0.e eVar) throws NoSuchMethodException, SecurityException {
            if (!(eVar instanceof k0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            j0 j0VarR = ((k0) eVar).r();
            t0.c cVarC = eVar.c();
            Iterator it = j0VarR.c().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.a(j0VarR.b((String) it.next()), cVarC, eVar.s());
            }
            if (j0VarR.c().isEmpty()) {
                return;
            }
            cVarC.i(a.class);
        }
    }

    static void a(f0 f0Var, t0.c cVar, j jVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) f0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(cVar, jVar);
        c(cVar, jVar);
    }

    static SavedStateHandleController b(t0.c cVar, j jVar, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, y.c(cVar.b(str), bundle));
        savedStateHandleController.h(cVar, jVar);
        c(cVar, jVar);
        return savedStateHandleController;
    }

    private static void c(final t0.c cVar, final j jVar) throws NoSuchMethodException, SecurityException {
        j.c cVarB = jVar.b();
        if (cVarB == j.c.INITIALIZED || cVarB.b(j.c.STARTED)) {
            cVar.i(a.class);
        } else {
            jVar.a(new l() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.l
                public void d(n nVar, j.b bVar) throws NoSuchMethodException, SecurityException {
                    if (bVar == j.b.ON_START) {
                        jVar.c(this);
                        cVar.i(a.class);
                    }
                }
            });
        }
    }
}
