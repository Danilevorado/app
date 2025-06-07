package e7;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class a extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private int f23239a;

    /* renamed from: b, reason: collision with root package name */
    private int f23240b;

    public a(int i10, int i11) {
        this.f23239a = i10;
        this.f23240b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int iD0 = recyclerView.d0(view);
        int i10 = this.f23240b;
        int i11 = iD0 % i10;
        int i12 = this.f23239a;
        rect.left = (i11 * i12) / i10;
        rect.right = i12 - (((i11 + 1) * i12) / i10);
        if (iD0 >= i10) {
            rect.top = i12;
        }
    }
}
