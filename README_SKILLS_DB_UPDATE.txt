HOMOMinds Skills DB Update

Added without changing the existing UI theme:
1. skills table via Skill entity.
2. SkillRepo and SkillService.
3. SkillDataLoader seeds all 64 Kalaalu into DB on startup if not already present.
4. Homepage 64 Kalaalu cards now read from DB.
5. Each skill opens a separate detail page at /skills/{slug}.
6. /skills page lists all 64 Kalaalu.

Run:
mvn spring-boot:run

Open:
http://localhost:8080/
http://localhost:8080/skills
Example:
http://localhost:8080/skills/singing
