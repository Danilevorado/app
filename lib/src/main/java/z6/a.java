package z6;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.k;
import com.jaiselrahman.filepicker.utils.FilePickerProvider;
import com.jaiselrahman.filepicker.view.SquareImage;
import j2.f;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import y6.d;
import z6.b;

/* loaded from: classes.dex */
public class a extends z6.b implements b.f {
    private ArrayList A;
    private Activity B;
    private k C;
    private b.f D;
    private b E;
    private boolean F;
    private boolean G;
    private File H;
    private Uri I;
    private SimpleDateFormat J;

    /* renamed from: z6.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0221a implements View.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f28881m;

        ViewOnClickListenerC0221a(boolean z10) {
            this.f28881m = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.E == null || a.this.E.q(this.f28881m)) {
                a.this.l0(this.f28881m);
            }
        }
    }

    public interface b {
        boolean q(boolean z10);
    }

    public static class c extends RecyclerView.d0 {

        /* renamed from: t, reason: collision with root package name */
        private ImageView f28883t;

        /* renamed from: u, reason: collision with root package name */
        private ImageView f28884u;

        /* renamed from: v, reason: collision with root package name */
        private ImageView f28885v;

        /* renamed from: w, reason: collision with root package name */
        private SquareImage f28886w;

        /* renamed from: x, reason: collision with root package name */
        private TextView f28887x;

        /* renamed from: y, reason: collision with root package name */
        private TextView f28888y;

        c(View view) {
            super(view);
            this.f28884u = (ImageView) view.findViewById(y6.c.f28562e);
            this.f28885v = (ImageView) view.findViewById(y6.c.f28563f);
            this.f28886w = (SquareImage) view.findViewById(y6.c.f28565h);
            this.f28887x = (TextView) view.findViewById(y6.c.f28559b);
            this.f28888y = (TextView) view.findViewById(y6.c.f28561d);
            this.f28883t = (ImageView) view.findViewById(y6.c.f28564g);
        }
    }

    public a(Activity activity, ArrayList arrayList, int i10, boolean z10, boolean z11) {
        int i11;
        super(arrayList);
        this.J = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        this.A = arrayList;
        this.B = activity;
        this.F = z10;
        this.G = z11;
        this.C = com.bumptech.glide.b.t(activity).i((f) ((f) f.q0(0.7f).R()).W(i10));
        super.Z(this);
        if (z10 && z11) {
            i11 = 2;
        } else if (!z10 && !z11) {
            return;
        } else {
            i11 = 1;
        }
        X(i11);
    }

    private String f0() {
        return this.J.format(new Date());
    }

    private void g0(ImageView imageView, boolean z10) {
        imageView.setVisibility(0);
        imageView.setOnClickListener(new ViewOnClickListenerC0221a(z10));
    }

    @Override // z6.b
    public void Z(b.f fVar) {
        this.D = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.F ? this.G ? this.A.size() + 2 : this.A.size() + 1 : this.G ? this.A.size() + 1 : this.A.size();
    }

    public File d0() {
        return this.H;
    }

    public Uri e0() {
        return this.I;
    }

    @Override // z6.b.f
    public void h() {
        b.f fVar = this.D;
        if (fVar != null) {
            fVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    @Override // z6.b, androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(z6.a.c r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.F
            r1 = 1
            r2 = 0
            r3 = 8
            if (r0 == 0) goto L2e
            if (r10 != 0) goto L12
            android.widget.ImageView r9 = z6.a.c.M(r9)
            r8.g0(r9, r2)
            return
        L12:
            boolean r0 = r8.G
            if (r0 == 0) goto L29
            if (r10 != r1) goto L20
            android.widget.ImageView r9 = z6.a.c.N(r9)
            r8.g0(r9, r1)
            return
        L20:
            android.widget.ImageView r0 = z6.a.c.N(r9)
            r0.setVisibility(r3)
            int r10 = r10 + (-1)
        L29:
            android.widget.ImageView r0 = z6.a.c.M(r9)
            goto L40
        L2e:
            boolean r0 = r8.G
            if (r0 == 0) goto L45
            if (r10 != 0) goto L3c
            android.widget.ImageView r9 = z6.a.c.N(r9)
            r8.g0(r9, r1)
            return
        L3c:
            android.widget.ImageView r0 = z6.a.c.N(r9)
        L40:
            r0.setVisibility(r3)
            int r10 = r10 + (-1)
        L45:
            super.p(r9, r10)
            java.util.ArrayList r0 = r8.A
            java.lang.Object r10 = r0.get(r10)
            c7.a r10 = (c7.a) r10
            int r0 = r10.c()
            r4 = 3
            r5 = 2
            if (r0 == r4) goto L84
            int r0 = r10.c()
            if (r0 != r1) goto L5f
            goto L84
        L5f:
            int r0 = r10.c()
            if (r0 != r5) goto L7a
            com.bumptech.glide.k r0 = r8.C
            android.net.Uri r1 = r10.g()
            com.bumptech.glide.j r0 = r0.q(r1)
            int r1 = y6.b.f28556a
            j2.f r1 = j2.f.o0(r1)
            com.bumptech.glide.j r0 = r0.a(r1)
            goto L8e
        L7a:
            com.jaiselrahman.filepicker.view.SquareImage r0 = z6.a.c.O(r9)
            int r1 = y6.b.f28557b
            r0.setImageResource(r1)
            goto L95
        L84:
            com.bumptech.glide.k r0 = r8.C
            android.net.Uri r1 = r10.h()
            com.bumptech.glide.j r0 = r0.q(r1)
        L8e:
            com.jaiselrahman.filepicker.view.SquareImage r1 = z6.a.c.O(r9)
            r0.x0(r1)
        L95:
            int r0 = r10.c()
            if (r0 == r4) goto Laa
            int r0 = r10.c()
            if (r0 != r5) goto La2
            goto Laa
        La2:
            android.widget.TextView r0 = z6.a.c.P(r9)
            r0.setVisibility(r3)
            goto Lc0
        Laa:
            android.widget.TextView r0 = z6.a.c.P(r9)
            r0.setVisibility(r2)
            android.widget.TextView r0 = z6.a.c.P(r9)
            long r6 = r10.a()
            java.lang.String r1 = d7.b.a(r6)
            r0.setText(r1)
        Lc0:
            int r0 = r10.c()
            if (r0 == 0) goto Ld5
            int r0 = r10.c()
            if (r0 != r5) goto Lcd
            goto Ld5
        Lcd:
            android.widget.TextView r0 = z6.a.c.Q(r9)
            r0.setVisibility(r3)
            goto Le7
        Ld5:
            android.widget.TextView r0 = z6.a.c.Q(r9)
            r0.setVisibility(r2)
            android.widget.TextView r0 = z6.a.c.Q(r9)
            java.lang.String r1 = r10.e()
            r0.setText(r1)
        Le7:
            android.widget.ImageView r9 = z6.a.c.R(r9)
            boolean r10 = r8.U(r10)
            if (r10 == 0) goto Lf2
            goto Lf3
        Lf2:
            r2 = r3
        Lf3:
            r9.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.a.p(z6.a$c, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public c r(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(this.B).inflate(d.f28567a, viewGroup, false));
    }

    @Override // z6.b.f
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void i(c cVar, int i10) {
        b.f fVar = this.D;
        if (fVar != null) {
            fVar.i(cVar, i10);
        }
        cVar.f28883t.setVisibility(0);
    }

    @Override // z6.b.f
    public void k() {
        b.f fVar = this.D;
        if (fVar != null) {
            fVar.k();
        }
    }

    @Override // z6.b.f
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, int i10) {
        b.f fVar = this.D;
        if (fVar != null) {
            fVar.d(cVar, i10);
        }
        cVar.f28883t.setVisibility(8);
    }

    public void l0(boolean z10) {
        Intent intent;
        File externalStoragePublicDirectory;
        String str;
        Uri uri;
        if (z10) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            str = "/VID_" + f0() + ".mp4";
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            str = "/IMG_" + f0() + ".jpeg";
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdir()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onClick: ");
            sb2.append(z10 ? "MOVIES" : "PICTURES");
            sb2.append(" Directory not exists");
            Log.d("FilePicker", sb2.toString());
            return;
        }
        File file = new File(externalStoragePublicDirectory.getAbsolutePath() + str);
        this.H = file;
        Uri uriJ = FilePickerProvider.j(this.B, file);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", this.H.getAbsolutePath());
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        this.I = this.B.getContentResolver().insert(uri, contentValues);
        intent.putExtra("output", uriJ);
        this.B.startActivityForResult(intent, 1);
    }

    public void m0(File file) {
        this.H = file;
    }

    public void n0(Uri uri) {
        this.I = uri;
    }

    @Override // z6.b.f
    public void o() {
        b.f fVar = this.D;
        if (fVar != null) {
            fVar.o();
        }
    }

    public void o0(b bVar) {
        this.E = bVar;
    }
}
