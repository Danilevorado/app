package d0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: u, reason: collision with root package name */
    private int f22800u;

    /* renamed from: v, reason: collision with root package name */
    private int f22801v;

    /* renamed from: w, reason: collision with root package name */
    private LayoutInflater f22802w;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f22801v = i10;
        this.f22800u = i10;
        this.f22802w = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // d0.a
    public View q(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22802w.inflate(this.f22801v, viewGroup, false);
    }

    @Override // d0.a
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f22802w.inflate(this.f22800u, viewGroup, false);
    }
}
