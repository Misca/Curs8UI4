package com.fasttracktit.curs8ui4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.fasttracktit.curs8ui4.adapter.MovieAdapter;
import com.fasttracktit.curs8ui4.viewmodel.MovieItemViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
      }
    });

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);


    ListView movieListView = (ListView) findViewById(R.id.moviesListView);

    List<MovieItemViewModel> movieList = getMoviesMockViewModel();
    MovieAdapter adapter = new MovieAdapter(this, movieList);

    movieListView.setAdapter(adapter);
  }

  private List<MovieItemViewModel> getMoviesMockViewModel() {
    List<MovieItemViewModel> moviesList = new ArrayList<>();

    moviesList.add(new MovieItemViewModel("Movie 1", "Some description 1", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 2", "Some description 2", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 3", "Some description 3", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 4", "Some description 4", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 5", "Some description 5", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 6", "Some description 6", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 7", "Some description 7", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 8", "Some description 8", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 9", "Some description 9", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 10", "Some description 10", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 11", "Some description 11", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 12", "Some description 12", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 13", "Some description 13", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 14", "Some description 14", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 15", "Some description 15", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 16", "Some description 16", R.drawable.movie_preview));
    moviesList.add(new MovieItemViewModel("Movie 17", "Some description 17", R.drawable.movie_preview));

    return moviesList;
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    }
    else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      Toast.makeText(this, "Action pressed", Toast.LENGTH_SHORT).show();
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.nav_camera) {
      // Handle the camera action
    }
    else if (id == R.id.nav_gallery) {

    }
    else if (id == R.id.nav_slideshow) {

    }
    else if (id == R.id.nav_manage) {

    }
    else if (id == R.id.nav_share) {

    }
    else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }
}
