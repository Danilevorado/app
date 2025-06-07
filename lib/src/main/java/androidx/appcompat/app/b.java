package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class b extends j {

    /* renamed from: q, reason: collision with root package name */
    final AlertController f477q;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f478a;

        /* renamed from: b, reason: collision with root package name */
        private final int f479b;

        public a(Context context) {
            this(context, b.n(context, 0));
        }

        public a(Context context, int i10) {
            this.f478a = new AlertController.b(new ContextThemeWrapper(context, b.n(context, i10)));
            this.f479b = i10;
        }

        public b a() {
            b bVar = new b(this.f478a.f437a, this.f479b);
            this.f478a.a(bVar.f477q);
            bVar.setCancelable(this.f478a.f454r);
            if (this.f478a.f454r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f478a.f455s);
            bVar.setOnDismissListener(this.f478a.f456t);
            DialogInterface.OnKeyListener onKeyListener = this.f478a.f457u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f478a.f437a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f459w = listAdapter;
            bVar.f460x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f478a.f454r = z10;
            return this;
        }

        public a e(View view) {
            this.f478a.f443g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f478a.f440d = drawable;
            return this;
        }

        public a g(int i10) {
            AlertController.b bVar = this.f478a;
            bVar.f444h = bVar.f437a.getText(i10);
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f478a.f444h = charSequence;
            return this;
        }

        public a i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f448l = bVar.f437a.getText(i10);
            this.f478a.f450n = onClickListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f448l = charSequence;
            bVar.f450n = onClickListener;
            return this;
        }

        public a k(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f451o = bVar.f437a.getText(i10);
            this.f478a.f453q = onClickListener;
            return this;
        }

        public a l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f451o = charSequence;
            bVar.f453q = onClickListener;
            return this;
        }

        public a m(DialogInterface.OnDismissListener onDismissListener) {
            this.f478a.f456t = onDismissListener;
            return this;
        }

        public a n(DialogInterface.OnKeyListener onKeyListener) {
            this.f478a.f457u = onKeyListener;
            return this;
        }

        public a o(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f445i = bVar.f437a.getText(i10);
            this.f478a.f447k = onClickListener;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f445i = charSequence;
            bVar.f447k = onClickListener;
            return this;
        }

        public a q(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f478a;
            bVar.f459w = listAdapter;
            bVar.f460x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a r(int i10) {
            AlertController.b bVar = this.f478a;
            bVar.f442f = bVar.f437a.getText(i10);
            return this;
        }

        public a s(CharSequence charSequence) {
            this.f478a.f442f = charSequence;
            return this;
        }

        public a t(View view) {
            AlertController.b bVar = this.f478a;
            bVar.f462z = view;
            bVar.f461y = 0;
            bVar.E = false;
            return this;
        }

        public b u() {
            b bVarA = a();
            bVarA.show();
            return bVarA;
        }
    }

    protected b(Context context, int i10) {
        super(context, n(context, i10));
        this.f477q = new AlertController(getContext(), this, getWindow());
    }

    static int n(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23299l, typedValue, true);
        return typedValue.resourceId;
    }

    public Button l(int i10) {
        return this.f477q.c(i10);
    }

    public ListView m() {
        return this.f477q.e();
    }

    @Override // androidx.appcompat.app.j, androidx.activity.f, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f477q.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f477q.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f477q.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.j, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f477q.q(charSequence);
    }
}
