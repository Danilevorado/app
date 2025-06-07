package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: m, reason: collision with root package name */
    private g f847m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.appcompat.app.b f848n;

    /* renamed from: o, reason: collision with root package name */
    e f849o;

    /* renamed from: p, reason: collision with root package name */
    private m.a f850p;

    public h(g gVar) {
        this.f847m = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z10) {
        if (z10 || gVar == this.f847m) {
            c();
        }
        m.a aVar = this.f850p;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.f850p;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.b bVar = this.f848n;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f847m;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), f.g.f23397j);
        this.f849o = eVar;
        eVar.j(this);
        this.f847m.b(this.f849o);
        aVar.c(this.f849o.b(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.e(viewY);
        } else {
            aVar.f(gVar.w()).s(gVar.x());
        }
        aVar.n(this);
        androidx.appcompat.app.b bVarA = aVar.a();
        this.f848n = bVarA;
        bVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f848n.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f848n.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f847m.L((i) this.f849o.b().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f849o.a(this.f847m, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f848n.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f848n.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f847m.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f847m.performShortcut(i10, keyEvent, 0);
    }
}
