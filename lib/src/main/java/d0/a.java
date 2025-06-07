package d0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: m, reason: collision with root package name */
    protected boolean f22789m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f22790n;

    /* renamed from: o, reason: collision with root package name */
    protected Cursor f22791o;

    /* renamed from: p, reason: collision with root package name */
    protected Context f22792p;

    /* renamed from: q, reason: collision with root package name */
    protected int f22793q;

    /* renamed from: r, reason: collision with root package name */
    protected C0117a f22794r;

    /* renamed from: s, reason: collision with root package name */
    protected DataSetObserver f22795s;

    /* renamed from: t, reason: collision with root package name */
    protected d0.b f22796t;

    /* renamed from: d0.a$a, reason: collision with other inner class name */
    private class C0117a extends ContentObserver {
        C0117a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.s();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f22789m = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f22789m = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        h(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursorT = t(cursor);
        if (cursorT != null) {
            cursorT.close();
        }
    }

    @Override // d0.b.a
    public Cursor b() {
        return this.f22791o;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void f(View view, Context context, Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f22789m || (cursor = this.f22791o) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f22789m) {
            return null;
        }
        this.f22791o.moveToPosition(i10);
        if (view == null) {
            view = q(this.f22792p, this.f22791o, viewGroup);
        }
        f(view, this.f22792p, this.f22791o);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f22796t == null) {
            this.f22796t = new d0.b(this);
        }
        return this.f22796t;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f22789m || (cursor = this.f22791o) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f22791o;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f22789m && (cursor = this.f22791o) != null && cursor.moveToPosition(i10)) {
            return this.f22791o.getLong(this.f22793q);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f22789m) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f22791o.moveToPosition(i10)) {
            if (view == null) {
                view = r(this.f22792p, this.f22791o, viewGroup);
            }
            f(view, this.f22792p, this.f22791o);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    void h(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f22790n = true;
        } else {
            this.f22790n = false;
        }
        boolean z10 = cursor != null;
        this.f22791o = cursor;
        this.f22789m = z10;
        this.f22792p = context;
        this.f22793q = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f22794r = new C0117a();
            bVar = new b();
        } else {
            bVar = null;
            this.f22794r = null;
        }
        this.f22795s = bVar;
        if (z10) {
            C0117a c0117a = this.f22794r;
            if (c0117a != null) {
                cursor.registerContentObserver(c0117a);
            }
            DataSetObserver dataSetObserver = this.f22795s;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View q(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View r(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void s() {
        Cursor cursor;
        if (!this.f22790n || (cursor = this.f22791o) == null || cursor.isClosed()) {
            return;
        }
        this.f22789m = this.f22791o.requery();
    }

    public Cursor t(Cursor cursor) {
        Cursor cursor2 = this.f22791o;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0117a c0117a = this.f22794r;
            if (c0117a != null) {
                cursor2.unregisterContentObserver(c0117a);
            }
            DataSetObserver dataSetObserver = this.f22795s;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f22791o = cursor;
        if (cursor != null) {
            C0117a c0117a2 = this.f22794r;
            if (c0117a2 != null) {
                cursor.registerContentObserver(c0117a2);
            }
            DataSetObserver dataSetObserver2 = this.f22795s;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f22793q = cursor.getColumnIndexOrThrow("_id");
            this.f22789m = true;
            notifyDataSetChanged();
        } else {
            this.f22793q = -1;
            this.f22789m = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
