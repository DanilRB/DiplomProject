package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.diplom_project.adapter.CategoryAdapter;
import com.example.diplom_project.adapter.CourseAdapter;
import com.example.diplom_project.model.Category;
import com.example.diplom_project.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCoursesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Вводный"));
        categoryList.add(new Category(2, "Средний"));
        categoryList.add(new Category(3, "Продв-ый"));
        categoryList.add(new Category(4, "Высший"));
        categoryList.add(new Category(5, "Индив-ый"));

        setCategoryRecycler(categoryList);


        courseList.add(new Course(1, "start", "Курс: Новичок", "1 сентября", "Начальный", "#424345", "За программу вы изучите: \n - Составные части телефона \n - Детали шлейфа и датчики \n - Методы диагностики и поиски неисправностей \n - Разбор часто встречающихся поломок", 1));
        courseList.add(new Course(2, "top", "Курс: Мастер", "1 сентября", "Средний", "#424345", "За программу вы изучите: \n - Температурные режимы работ \n - Пайка SMD компонентов \n - Перемычки и методы их установки \n - Пайка BGA компонентов без компаунда", 2));
        courseList.add(new Course(3, "pro", "Курс: Инженер", "1 сентября", "Средний", "#424345", "За программу вы изучите: \n - Пайка BGA компонентов под компаундом \n - Работа с нижним подогревом \n - Увеличение памяти Iphone \n - Работа с точечной сваркой", 2));
        courseList.add(new Course(4, "expert", "Курс: Эксперт", "1 сентября", "Продвинутый", "#424345", "За программу вы изучите: \n - Тонкости ремонта Face Id \n - Ремонт межслойных прогаров \n - Замена оперативной памяти \n - Расширенная теория схемотехники для выявления неисправностей",3));
        courseList.add(new Course(5, "screen", "Курс: Специалист", "1 сентября", "Высший", "#424345", "За программу вы изучите: \n - Работа с ламинатором \n - Работа с Loca и Oca \n - Работа с лазерным гравером \n - Работа в беспылевой камере", 4));
        courseList.add(new Course(6, "puzzle", "Индивидуальный курс", "По договору", "Личный", "#424345", "За занятие вы: \n - Получите ответы на все интересующие вопросы \n - Сможете поработать на нашем оборудовании", 5));

        fullCoursesList.addAll(courseList);

        setCourseRecycler(courseList);
    }

    public void openGuide(View view){
        Intent intent = new Intent(this, GuideMain.class);
        startActivity(intent);
    }

    public void openMaps(View view){
        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("geo: 55.107669, 82.933644?z=15"));
        startActivity(intent1);
    }

    public void openMe(View view){
        Intent intent2 = new Intent(this, ButtonMe.class);
        startActivity(intent2);
    }

    public void openContact(View view){
        Intent intent3 = new Intent(this, Button_contact.class);
        startActivity(intent3);
    }

    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);

    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }

    public static void showCoursesByCategory(int category){

        courseList.clear();
        courseList.addAll(fullCoursesList);
        List<Course> filterCourses = new ArrayList<>();

        for(Course c : courseList){
            if(c.getCategory() == category)
                filterCourses.add(c);
        }

        courseList.clear();
        courseList.addAll(filterCourses);

        courseAdapter.notifyDataSetChanged();
    }
    public void OpenFullCourse(View view){
        courseList.clear();
        courseList.addAll(fullCoursesList);
        courseAdapter.notifyDataSetChanged();
    }
}