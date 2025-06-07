package com.jaiselrahman.filepicker.activity;

import a7.a;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Point;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import y6.d;
import y6.e;
import y6.f;
import z6.a;
import z6.b;

/* loaded from: classes.dex */
public class FilePickerActivity extends c implements b.f, a.b {
    private a7.a M;
    private ArrayList N = new ArrayList();
    private z6.a O;
    private int P;

    class a implements b7.c {
        a() {
        }

        @Override // b7.c
        public void a(ArrayList arrayList) {
            if (arrayList != null) {
                FilePickerActivity.this.N.clear();
                FilePickerActivity.this.N.addAll(arrayList);
                FilePickerActivity.this.O.l();
            }
        }
    }

    class b implements MediaScannerConnection.OnScanCompletedListener {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FilePickerActivity.this.f0(true);
            }
        }

        b() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            if (uri != null) {
                FilePickerActivity.this.runOnUiThread(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z10) {
        b7.a.g(this, new a(), this.M, z10);
    }

    private boolean j0() {
        return (Build.VERSION.SDK_INT < 29 || !this.M.y() || this.M.z() || this.M.A() || this.M.x()) ? false : true;
    }

    @Override // z6.b.f
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void i(a.c cVar, int i10) {
        if (this.P > 0) {
            setTitle(getResources().getString(f.f28571b, Integer.valueOf(this.O.R()), Integer.valueOf(this.P)));
        }
    }

    @Override // z6.b.f
    public void h() {
    }

    @Override // z6.b.f
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d(a.c cVar, int i10) {
        if (this.P > 0) {
            setTitle(getResources().getString(f.f28571b, Integer.valueOf(this.O.R()), Integer.valueOf(this.P)));
        }
    }

    public boolean i0(String[] strArr, int i10) {
        char c10;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                c10 = 0;
                break;
            }
            if (androidx.core.content.a.a(this, strArr[i11]) != 0) {
                c10 = 65535;
                break;
            }
            i11++;
        }
        if (c10 == 0) {
            return true;
        }
        if (this.M.m()) {
            requestPermissions(strArr, i10);
        } else {
            Toast.makeText(this, f.f28570a, 0).show();
            finish();
        }
        return false;
    }

    @Override // z6.b.f
    public void k() {
    }

    @Override // z6.b.f
    public void o() {
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            File fileD0 = this.O.d0();
            if (i11 == -1) {
                MediaScannerConnection.scanFile(this, new String[]{fileD0.getAbsolutePath()}, null, new b());
                return;
            } else {
                getContentResolver().delete(this.O.e0(), null, null);
                return;
            }
        }
        if (i10 == 4) {
            ContentResolver contentResolver = getContentResolver();
            ArrayList arrayList = new ArrayList();
            if (intent == null) {
                finish();
                return;
            }
            Uri data = intent.getData();
            if (data == null) {
                ClipData clipData = intent.getClipData();
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    arrayList.add(b7.a.a(contentResolver, clipData.getItemAt(i12).getUri(), this.M));
                }
            } else {
                arrayList.add(b7.a.a(contentResolver, data, this.M));
            }
            Intent intent2 = new Intent();
            intent2.putExtra("MEDIA_FILES", arrayList);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a7.a aVar = (a7.a) getIntent().getParcelableExtra("CONFIGS");
        this.M = aVar;
        if (aVar == null) {
            this.M = new a.b().u();
        }
        if (j0()) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String[] strArrJ = this.M.j();
            String[] strArr = new String[strArrJ.length];
            for (int i10 = 0; i10 < strArrJ.length; i10++) {
                strArr[i10] = singleton.getMimeTypeFromExtension(strArrJ[i10].replace(".", ""));
            }
            startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT").setType("*/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", this.M.e() > 1).putExtra("android.intent.extra.MIME_TYPES", strArr), 4);
            return;
        }
        setContentView(d.f28568b);
        Z((Toolbar) findViewById(y6.c.f28566i));
        int iD = getResources().getConfiguration().orientation == 2 ? this.M.d() : this.M.f();
        int iC = this.M.c();
        if (iC <= 0) {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            iC = Math.min(point.x, point.y) / this.M.f();
        }
        int i11 = iC;
        boolean zB = this.M.B();
        z6.a aVar2 = new z6.a(this, this.N, i11, this.M.w(), this.M.E());
        this.O = aVar2;
        aVar2.P(true);
        this.O.Q(this.M.C());
        this.O.Z(this);
        this.O.b0(zB);
        this.O.Y(zB ? 1 : this.M.e());
        this.O.a0(this.M.h());
        this.O.o0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(y6.c.f28560c);
        recyclerView.setLayoutManager(new GridLayoutManager(this, iD));
        recyclerView.setAdapter(this.O);
        recyclerView.h(new e7.a(getResources().getDimensionPixelSize(y6.a.f28555a), iD));
        recyclerView.setItemAnimator(null);
        if (i0(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1)) {
            f0(false);
        }
        int iE = this.M.e();
        this.P = iE;
        if (iE > 0) {
            setTitle(getResources().getString(f.f28571b, Integer.valueOf(this.O.R()), Integer.valueOf(this.P)));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(e.f28569a, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != y6.c.f28558a) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("MEDIA_FILES", this.O.S());
        setResult(-1, intent);
        finish();
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 1) {
            if (iArr[0] == 0) {
                f0(false);
                return;
            } else {
                Toast.makeText(this, f.f28570a, 0).show();
                finish();
                return;
            }
        }
        if (i10 == 2 || i10 == 3) {
            if (iArr[0] == 0) {
                this.O.l0(i10 == 3);
            } else {
                Toast.makeText(this, f.f28570a, 0).show();
            }
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (j0()) {
            return;
        }
        String string = bundle.getString("PATH");
        if (string != null) {
            this.O.m0(new File(string));
        }
        Uri uri = (Uri) bundle.getParcelable("URI");
        if (uri != null) {
            this.O.n0(uri);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SELECTED_MEDIA_FILES");
        if (parcelableArrayList != null) {
            this.O.a0(parcelableArrayList);
            this.O.l();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (j0()) {
            return;
        }
        File fileD0 = this.O.d0();
        if (fileD0 != null) {
            bundle.putString("PATH", fileD0.getAbsolutePath());
        }
        bundle.putParcelable("URI", this.O.e0());
        bundle.putParcelableArrayList("SELECTED_MEDIA_FILES", this.O.S());
    }

    @Override // z6.a.b
    public boolean q(boolean z10) {
        return i0(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, z10 ? 3 : 2);
    }
}
