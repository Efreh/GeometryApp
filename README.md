
# GeometryLibrary

## Описание
GeometryLibrary — это библиотека для работы с геометрическими фигурами. Она включает в себя классы для представления основных двумерных фигур, таких как круг, прямоугольник и треугольник, а также трехмерных фигур, таких как куб и сфера. Библиотека позволяет вычислять площадь и периметр (или объем для трехмерных фигур) для различных геометрических форм.

## Структура проекта
- **GeometryLibrary**: Основной модуль, содержащий классы для двумерных фигур:
    - `Circle`: Класс для представления круга.
    - `Rectangle`: Класс для представления прямоугольника.
    - `Triangle`: Класс для представления треугольника.
    - `Sphere`: Класс для представления сферы (трехмерная фигура).
- **GeometryUtils**: Модуль с дополнительными функциями для работы с геометрическими данными, включая преобразование единиц измерения и сравнение фигур.
- **ThreeDimensionalShapes**: Модуль для поддержки трехмерных фигур (например, куб, сфера).
- **GeometryApp**: Приложение, использующее библиотеку GeometryLibrary для создания объектов различных геометрических фигур и вывода информации о них.

## Установка
1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/ваш_пользователь/GeometryLibrary.git
   cd GeometryLibrary
   ```

2. Соберите проект с помощью Maven:
   ```bash
   mvn clean install
   ```

## Использование
Запустите приложение GeometryTestApp для демонстрации функциональности библиотеки:
```bash
mvn exec:java -Dexec.mainClass="com.efr.app.GeometryTestApp"
```

## Версионирование
- Версия GeometryLibrary: 1.0.0 (последующая версия 1.1.0 после внесения изменений в код).
- Версия GeometryUtils: 1.0.0-SNAPSHOT (последующая версия 1.1.0-SNAPSHOT после внесения изменений).
- Версия ThreeDimensionalShapes: 1.0.0-SNAPSHOT (последующая версия 1.1.0-SNAPSHOT после внесения изменений).

## Дополнительная информация
Для получения дополнительной информации о библиотеке и ее функциональности, пожалуйста, ознакомьтесь с исходным кодом и документацией в репозитории.