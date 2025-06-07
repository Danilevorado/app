package com.pushwoosh.inapp.view;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import com.pushwoosh.inapp.view.d;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class e extends Fragment implements d.a {

    /* renamed from: m, reason: collision with root package name */
    private AsyncTask f22605m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference f22606n = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private c f22607o = c.NONE;

    /* renamed from: p, reason: collision with root package name */
    private t8.a f22608p;

    /* renamed from: q, reason: collision with root package name */
    private p8.a f22609q;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22610a;

        static {
            int[] iArr = new int[c.values().length];
            f22610a = iArr;
            try {
                iArr[c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22610a[c.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22610a[c.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    interface b {
        void a();

        void e();

        boolean g(t8.a aVar);

        void h(p8.a aVar);
    }

    public enum c {
        LOADING,
        SUCCESS,
        ERROR,
        NONE
    }

    public static e c(q9.b bVar) {
        e eVar = new e();
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("keyInapp", bVar);
        eVar.setArguments(bundle);
        return eVar;
    }

    private void e(o8.b bVar) {
        b bVar2 = (b) this.f22606n.get();
        if (bVar2 == null) {
            return;
        }
        if (!bVar.f()) {
            bVar2.e();
            bVar2.h((p8.a) bVar.e());
        } else {
            if (bVar2.g((t8.a) bVar.d())) {
                return;
            }
            bVar2.e();
        }
    }

    private void g(o8.b bVar) {
        if (bVar.f()) {
            this.f22607o = c.SUCCESS;
            this.f22608p = (t8.a) bVar.d();
        } else {
            this.f22607o = c.ERROR;
            this.f22609q = (p8.a) bVar.e();
        }
    }

    @Override // com.pushwoosh.inapp.view.d.a
    public void a() {
        this.f22607o = c.LOADING;
        b bVar = (b) this.f22606n.get();
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.pushwoosh.inapp.view.d.a
    public void b(o8.b bVar) {
        g(bVar);
        e(bVar);
    }

    public void d() {
        if (getActivity() instanceof b) {
            this.f22606n = new WeakReference((b) getActivity());
        }
        b bVar = (b) this.f22606n.get();
        if (bVar == null) {
            return;
        }
        int i10 = a.f22610a[this.f22607o.ordinal()];
        if (i10 == 1) {
            bVar.e();
            bVar.g(this.f22608p);
        } else if (i10 == 2) {
            bVar.h(this.f22609q);
            bVar.e();
        } else if (i10 == 3) {
            bVar.a();
        } else {
            if (getArguments() == null) {
                return;
            }
            f((q9.b) getArguments().getSerializable("keyInapp"));
        }
    }

    public void f(q9.b bVar) {
        d dVar = new d(bVar, this);
        this.f22605m = dVar;
        dVar.execute(new Void[0]);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        d();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() == null) {
            return;
        }
        q9.b bVar = (q9.b) getArguments().getSerializable("keyInapp");
        if (bundle == null) {
            f(bVar);
            return;
        }
        this.f22607o = c.values()[bundle.getInt("[InApp]InAppFragment.key_STATE")];
        this.f22608p = (t8.a) bundle.getSerializable("[InApp]InAppFragment.key_HTML_DATA");
        this.f22609q = (p8.a) bundle.getSerializable("[InApp]InAppFragment.key_ERROR");
        c cVar = this.f22607o;
        if (cVar == c.SUCCESS || cVar == c.ERROR) {
            return;
        }
        f(bVar);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f22605m;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f22605m = null;
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f22606n = null;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("[InApp]InAppFragment.key_ERROR", this.f22609q);
        bundle.putSerializable("[InApp]InAppFragment.key_HTML_DATA", this.f22608p);
        bundle.putInt("[InApp]InAppFragment.key_STATE", this.f22607o.ordinal());
    }
}
