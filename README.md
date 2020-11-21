# CircularRatingWithAvatar
A custom android component to show rating with colorful circular view 
### Samples
|   |   |
|:-:|:-:|
| <img  src="/sample4.gif" alt="Example 1" width="200" style="max-width:100%;"> | <img  src="/sample5.gif" alt="Example 1" width="200" style="max-width:100%;"> |
| <img src="/sample6.gif" alt="Example 1" width="200" style="max-width:100%;"> | 



[![](https://jitpack.io/v/BarOvda/CircularRatingWithAvatar.svg)](https://jitpack.io/#BarOvda/CircularRatingWithAvatar/1.1)

## Setup

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.BarOvda:CircularRatingWithAvatar:Tag'
	}
	
	
	
## XML
```
    <com.example.circularratingwithavatarlibrary.ProgressTextView
        android:id="@+id/circular_rating_bar"
        android:layout_width="184dp"
        android:layout_height="150dp"
        android:layout_marginStart="84dp"
        android:layout_marginLeft="84dp"
        android:layout_marginTop="204dp"
        app:current_rating="8"
        app:mid_color = "@color/mid_color"
        app:low_color = "@color/min_color"
        app:high_color = "@color/high_color"
        app:layout_constraintStart_toStartOf="parent"

        app:layout_constraintTop_toTopOf="parent"
        app:max_rating="10">
    </com.example.circularratingwithavatarlibrary.ProgressTextView>


```

Here is the list of properties you can use to configure this view:
 1. app:max_rating (float)  ==> sets the maximum value of rating (deafult value:100)
 2. app:current_rating (float) ==> sets the rating (deafult value:0)
 3. app:low_color (color)  ==> sets the maximum value of rating (deafult value:#FFDC1D1D)
 4. app:mid_color (color) ==> sets the rating (deafult value:#FFB5B208)
 5. app:high_color (color)  ==> sets the maximum value of rating (deafult value:#FF20BA05)
 
