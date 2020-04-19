package com.e.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intens", "Android Programming")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java fundamentals", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The core Plarform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var note1 = NoteInfo(CourseInfo("java_core", "Java Fundamentals: The core Plarform"), "Note#1", "Text of Note#1")
        notes.add(note1)

        var note2 = NoteInfo(CourseInfo("android_async", "Android Async Programming"), "Note#2", "Text of Note#2")
        notes.add(note2)

        var note3 = NoteInfo(CourseInfo("java_lang", "Java fundamentals"), "Note#3", "Text of Note#3")
        notes.add(note3)



    }
}