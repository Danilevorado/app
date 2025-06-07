package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.facebook.ads.internal.api.AdSizeApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1610a;

    /* renamed from: b, reason: collision with root package name */
    String f1611b;

    /* renamed from: c, reason: collision with root package name */
    private b f1612c;

    /* renamed from: d, reason: collision with root package name */
    private int f1613d;

    /* renamed from: e, reason: collision with root package name */
    private float f1614e;

    /* renamed from: f, reason: collision with root package name */
    private String f1615f;

    /* renamed from: g, reason: collision with root package name */
    boolean f1616g;

    /* renamed from: h, reason: collision with root package name */
    private int f1617h;

    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0015a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1618a;

        static {
            int[] iArr = new int[b.values().length];
            f1618a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1618a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1618a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1618a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1618a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1618a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1618a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1618a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.f1610a = false;
        this.f1611b = aVar.f1611b;
        this.f1612c = aVar.f1612c;
        d(obj);
    }

    public a(String str, b bVar, Object obj, boolean z10) {
        this.f1611b = str;
        this.f1612c = bVar;
        this.f1610a = z10;
        d(obj);
    }

    public static HashMap a(HashMap map, View view) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap map) {
        b bVar;
        int resourceId;
        Object string;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f1852k4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        b bVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == g.f1861l4) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == g.f1942v4) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == g.f1870m4) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == g.f1886o4) {
                    bVar = b.COLOR_TYPE;
                } else if (index == g.f1879n4) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == g.f1918s4) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == g.f1894p4) {
                        bVar = b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == g.f1902q4) {
                        bVar = b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == g.f1910r4) {
                            bVar = b.INT_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        } else if (index == g.f1934u4) {
                            bVar = b.STRING_TYPE;
                            string = typedArrayObtainStyledAttributes.getString(index);
                            Object obj = string;
                            bVar2 = bVar;
                            objValueOf = obj;
                        } else if (index == g.f1926t4) {
                            bVar = b.REFERENCE_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj2 = string;
                        bVar2 = bVar;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj22 = string;
                    bVar2 = bVar;
                    objValueOf = obj22;
                }
                resourceId = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj222 = string;
                bVar2 = bVar;
                objValueOf = obj222;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new a(string2, bVar2, objValueOf, z10));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            String str2 = aVar.f1610a ? str : "set" + str;
            try {
                switch (C0015a.f1618a[aVar.f1612c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1613d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1616g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f1615f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1617h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1617h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1613d));
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1614e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1614e));
                        break;
                }
            } catch (IllegalAccessException e5) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e5.printStackTrace();
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", e10.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e11.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C0015a.f1618a[this.f1612c.ordinal()]) {
            case 1:
            case 6:
                this.f1613d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f1616g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f1615f = (String) obj;
                break;
            case 4:
            case 5:
                this.f1617h = ((Integer) obj).intValue();
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
                this.f1614e = ((Float) obj).floatValue();
                break;
        }
    }
}
