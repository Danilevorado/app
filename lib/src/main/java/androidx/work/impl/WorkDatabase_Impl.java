package androidx.work.impl;

import androidx.room.i0;
import androidx.room.j0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.f;
import u0.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: p, reason: collision with root package name */
    private volatile g1.w f4056p;

    /* renamed from: q, reason: collision with root package name */
    private volatile g1.b f4057q;

    /* renamed from: r, reason: collision with root package name */
    private volatile g1.a0 f4058r;

    /* renamed from: s, reason: collision with root package name */
    private volatile g1.j f4059s;

    /* renamed from: t, reason: collision with root package name */
    private volatile g1.o f4060t;

    /* renamed from: u, reason: collision with root package name */
    private volatile g1.r f4061u;

    /* renamed from: v, reason: collision with root package name */
    private volatile g1.e f4062v;

    class a extends j0.a {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.j0.a
        public void a(u0.g gVar) {
            gVar.p("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.p("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.p("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // androidx.room.j0.a
        public void b(u0.g gVar) {
            gVar.p("DROP TABLE IF EXISTS `Dependency`");
            gVar.p("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.p("DROP TABLE IF EXISTS `WorkTag`");
            gVar.p("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.p("DROP TABLE IF EXISTS `WorkName`");
            gVar.p("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.p("DROP TABLE IF EXISTS `Preference`");
            if (((i0) WorkDatabase_Impl.this).f3665h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f3665h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f3665h.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.j0.a
        protected void c(u0.g gVar) {
            if (((i0) WorkDatabase_Impl.this).f3665h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f3665h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f3665h.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.j0.a
        public void d(u0.g gVar) {
            ((i0) WorkDatabase_Impl.this).f3658a = gVar;
            gVar.p("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.t(gVar);
            if (((i0) WorkDatabase_Impl.this).f3665h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f3665h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f3665h.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.j0.a
        public void e(u0.g gVar) {
        }

        @Override // androidx.room.j0.a
        public void f(u0.g gVar) {
            s0.c.a(gVar);
        }

        @Override // androidx.room.j0.a
        protected j0.b g(u0.g gVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            s0.f fVar = new s0.f("Dependency", map, hashSet, hashSet2);
            s0.f fVarA = s0.f.a(gVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new j0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new f.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new f.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new f.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new f.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("required_network_type", new f.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new f.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            s0.f fVar2 = new s0.f("WorkSpec", map2, hashSet3, hashSet4);
            s0.f fVarA2 = s0.f.a(gVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new j0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            s0.f fVar3 = new s0.f("WorkTag", map3, hashSet5, hashSet6);
            s0.f fVarA3 = s0.f.a(gVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new j0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new f.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            s0.f fVar4 = new s0.f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            s0.f fVarA4 = s0.f.a(gVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new j0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            s0.f fVar5 = new s0.f("WorkName", map5, hashSet8, hashSet9);
            s0.f fVarA5 = s0.f.a(gVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new j0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            s0.f fVar6 = new s0.f("WorkProgress", map6, hashSet10, new HashSet(0));
            s0.f fVarA6 = s0.f.a(gVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new j0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            s0.f fVar7 = new s0.f("Preference", map7, new HashSet(0), new HashSet(0));
            s0.f fVarA7 = s0.f.a(gVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new j0.b(true, null);
            }
            return new j0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.b E() {
        g1.b bVar;
        if (this.f4057q != null) {
            return this.f4057q;
        }
        synchronized (this) {
            if (this.f4057q == null) {
                this.f4057q = new g1.c(this);
            }
            bVar = this.f4057q;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.e F() {
        g1.e eVar;
        if (this.f4062v != null) {
            return this.f4062v;
        }
        synchronized (this) {
            if (this.f4062v == null) {
                this.f4062v = new g1.f(this);
            }
            eVar = this.f4062v;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.j G() {
        g1.j jVar;
        if (this.f4059s != null) {
            return this.f4059s;
        }
        synchronized (this) {
            if (this.f4059s == null) {
                this.f4059s = new g1.k(this);
            }
            jVar = this.f4059s;
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.o H() {
        g1.o oVar;
        if (this.f4060t != null) {
            return this.f4060t;
        }
        synchronized (this) {
            if (this.f4060t == null) {
                this.f4060t = new g1.p(this);
            }
            oVar = this.f4060t;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.r I() {
        g1.r rVar;
        if (this.f4061u != null) {
            return this.f4061u;
        }
        synchronized (this) {
            if (this.f4061u == null) {
                this.f4061u = new g1.s(this);
            }
            rVar = this.f4061u;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.w J() {
        g1.w wVar;
        if (this.f4056p != null) {
            return this.f4056p;
        }
        synchronized (this) {
            if (this.f4056p == null) {
                this.f4056p = new g1.x(this);
            }
            wVar = this.f4056p;
        }
        return wVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public g1.a0 K() {
        g1.a0 a0Var;
        if (this.f4058r != null) {
            return this.f4058r;
        }
        synchronized (this) {
            if (this.f4058r == null) {
                this.f4058r = new g1.b0(this);
            }
            a0Var = this.f4058r;
        }
        return a0Var;
    }

    @Override // androidx.room.i0
    protected androidx.room.p g() {
        return new androidx.room.p(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.i0
    protected u0.h h(androidx.room.j jVar) {
        return jVar.f3701a.a(h.b.a(jVar.f3702b).d(jVar.f3703c).c(new j0(jVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // androidx.room.i0
    public List j(Map map) {
        return Arrays.asList(new b0(), new c0(), new d0());
    }

    @Override // androidx.room.i0
    public Set n() {
        return new HashSet();
    }

    @Override // androidx.room.i0
    protected Map o() {
        HashMap map = new HashMap();
        map.put(g1.w.class, g1.x.w());
        map.put(g1.b.class, g1.c.e());
        map.put(g1.a0.class, g1.b0.d());
        map.put(g1.j.class, g1.k.h());
        map.put(g1.o.class, g1.p.c());
        map.put(g1.r.class, g1.s.d());
        map.put(g1.e.class, g1.f.c());
        map.put(g1.g.class, g1.h.a());
        return map;
    }
}
