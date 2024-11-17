<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">

<!-- Texto para mostrar el estado del estacionamiento -->
<TextView
android:id="@+id/parkingStatus"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Estado del Estacionamiento"
android:textSize="24sp"
app:layout_constraintBottom_toTopOf="@+id/requestSpaceButton"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />

<!-- Botón para solicitar espacio de estacionamiento -->
<Button
android:id="@+id/requestSpaceButton"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Solicitar Espacio"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
