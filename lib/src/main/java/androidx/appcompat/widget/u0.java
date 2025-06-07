package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class u0 extends d0.c implements View.OnClickListener {
    private final WeakHashMap A;
    private final int B;
    private boolean C;
    private int D;
    private ColorStateList E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;

    /* renamed from: x, reason: collision with root package name */
    private final SearchView f1373x;

    /* renamed from: y, reason: collision with root package name */
    private final SearchableInfo f1374y;

    /* renamed from: z, reason: collision with root package name */
    private final Context f1375z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1376a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1377b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1378c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1379d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1380e;

        public a(View view) {
            this.f1376a = (TextView) view.findViewById(R.id.text1);
            this.f1377b = (TextView) view.findViewById(R.id.text2);
            this.f1378c = (ImageView) view.findViewById(R.id.icon1);
            this.f1379d = (ImageView) view.findViewById(R.id.icon2);
            this.f1380e = (ImageView) view.findViewById(f.f.f23378q);
        }
    }

    public u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.C = false;
        this.D = 1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.f1373x = searchView;
        this.f1374y = searchableInfo;
        this.B = searchView.getSuggestionCommitIconResId();
        this.f1375z = context;
        this.A = weakHashMap;
    }

    private Drawable A(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return B(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1375z.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e5) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e5);
                }
            }
        } catch (FileNotFoundException e10) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
        return null;
    }

    private Drawable C(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1375z.getPackageName() + "/" + i10;
            Drawable drawableU = u(str2);
            if (drawableU != null) {
                return drawableU;
            }
            Drawable drawableE = androidx.core.content.a.e(this.f1375z, i10);
            K(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableU2 = u(str);
            if (drawableU2 != null) {
                return drawableU2;
            }
            Drawable drawableA = A(Uri.parse(str));
            K(str, drawableA);
            return drawableA;
        }
    }

    private Drawable D(Cursor cursor) throws NumberFormatException, IOException {
        int i10 = this.I;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableC = C(cursor.getString(i10));
        return drawableC != null ? drawableC : z();
    }

    private Drawable E(Cursor cursor) {
        int i10 = this.J;
        if (i10 == -1) {
            return null;
        }
        return C(cursor.getString(i10));
    }

    private static String G(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    private void I(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void J(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void K(String str, Drawable drawable) {
        if (drawable != null) {
            this.A.put(str, drawable.getConstantState());
        }
    }

    private void L(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable u(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.A.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence v(CharSequence charSequence) {
        if (this.E == null) {
            TypedValue typedValue = new TypedValue();
            this.f1375z.getTheme().resolveAttribute(f.a.I, typedValue, true);
            this.E = this.f1375z.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.E, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable w(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f1375z.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e5) {
            string = e5.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", string);
        return null;
    }

    private Drawable x(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.A.containsKey(strFlattenToShortString)) {
            Drawable drawableW = w(componentName);
            this.A.put(strFlattenToShortString, drawableW != null ? drawableW.getConstantState() : null);
            return drawableW;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.A.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1375z.getResources());
    }

    public static String y(Cursor cursor, String str) {
        return G(cursor, cursor.getColumnIndex(str));
    }

    private Drawable z() throws PackageManager.NameNotFoundException {
        Drawable drawableX = x(this.f1374y.getSearchActivity());
        return drawableX != null ? drawableX : this.f1375z.getPackageManager().getDefaultActivityIcon();
    }

    Drawable B(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1375z.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor F(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1375z.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void H(int i10) {
        this.D = i10;
    }

    @Override // d0.a, d0.b.a
    public void a(Cursor cursor) {
        if (this.C) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.F = cursor.getColumnIndex("suggest_text_1");
                this.G = cursor.getColumnIndex("suggest_text_2");
                this.H = cursor.getColumnIndex("suggest_text_2_url");
                this.I = cursor.getColumnIndex("suggest_icon_1");
                this.J = cursor.getColumnIndex("suggest_icon_2");
                this.K = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // d0.a, d0.b.a
    public CharSequence c(Cursor cursor) {
        String strY;
        String strY2;
        if (cursor == null) {
            return null;
        }
        String strY3 = y(cursor, "suggest_intent_query");
        if (strY3 != null) {
            return strY3;
        }
        if (this.f1374y.shouldRewriteQueryFromData() && (strY2 = y(cursor, "suggest_intent_data")) != null) {
            return strY2;
        }
        if (!this.f1374y.shouldRewriteQueryFromText() || (strY = y(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strY;
    }

    @Override // d0.b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1373x.getVisibility() == 0 && this.f1373x.getWindowVisibility() == 0) {
            try {
                Cursor cursorF = F(this.f1374y, string, 50);
                if (cursorF != null) {
                    cursorF.getCount();
                    return cursorF;
                }
            } catch (RuntimeException e5) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e5);
            }
        }
        return null;
    }

    @Override // d0.a
    public void f(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.K;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1376a != null) {
            J(aVar.f1376a, G(cursor, this.F));
        }
        if (aVar.f1377b != null) {
            String strG = G(cursor, this.H);
            CharSequence charSequenceV = strG != null ? v(strG) : G(cursor, this.G);
            if (TextUtils.isEmpty(charSequenceV)) {
                TextView textView = aVar.f1376a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1376a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1376a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1376a.setMaxLines(1);
                }
            }
            J(aVar.f1377b, charSequenceV);
        }
        ImageView imageView = aVar.f1378c;
        if (imageView != null) {
            I(imageView, D(cursor), 4);
        }
        ImageView imageView2 = aVar.f1379d;
        if (imageView2 != null) {
            I(imageView2, E(cursor), 8);
        }
        int i12 = this.D;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1380e.setVisibility(8);
            return;
        }
        aVar.f1380e.setVisibility(0);
        aVar.f1380e.setTag(aVar.f1376a.getText());
        aVar.f1380e.setOnClickListener(this);
    }

    @Override // d0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewQ = q(this.f1375z, b(), viewGroup);
            if (viewQ != null) {
                ((a) viewQ.getTag()).f1376a.setText(e5.toString());
            }
            return viewQ;
        }
    }

    @Override // d0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewR = r(this.f1375z, b(), viewGroup);
            if (viewR != null) {
                ((a) viewR.getTag()).f1376a.setText(e5.toString());
            }
            return viewR;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        L(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        L(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1373x.U((CharSequence) tag);
        }
    }

    @Override // d0.c, d0.a
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewR = super.r(context, cursor, viewGroup);
        viewR.setTag(new a(viewR));
        ((ImageView) viewR.findViewById(f.f.f23378q)).setImageResource(this.B);
        return viewR;
    }
}
