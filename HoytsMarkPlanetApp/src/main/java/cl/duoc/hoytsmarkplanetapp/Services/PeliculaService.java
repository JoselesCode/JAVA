
package cl.duoc.hoytsmarkplanetapp.Services;

import cl.duoc.hoytsmarkplanetapp.DTO.PeliculaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joseles Student
 */
public class PeliculaService {
    private Connection conexion;

    public PeliculaService() {
        // Configura la conexión a tu base de datos (reemplaza con tus propios datos)
        String url = "jdbc:mysql://localhost:3306/moviesDB";
        String usuario = "root";
        String contraseña = "";

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    public void agregarPelicula(PeliculaDTO peliculaDTO) {
       try {
        String sqlInsert = "INSERT INTO MOVIE (titulo, director, anio, duracion, genero) " +
                           "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sqlInsert)) {
            preparedStatement.setString(1, peliculaDTO.getTitulo());
            preparedStatement.setString(2, peliculaDTO.getDirector());
            preparedStatement.setInt(3, peliculaDTO.getAnio());
            preparedStatement.setInt(4, peliculaDTO.getDuracion());
            preparedStatement.setString(5, peliculaDTO.getGenero());

            preparedStatement.executeUpdate();
            System.out.println("Película guardada con éxito");
        }
    } catch (SQLException ex) {
        System.out.println("Error al guardar la película: " + ex.getMessage());
    }
} // Implementación para agregar una película...
    
    public List<PeliculaDTO> CapturarPeliculas() {
        List<PeliculaDTO> peliculas = new ArrayList<>();

    try {
        String sqlSelect = "SELECT * FROM MOVIE";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                PeliculaDTO pelicula = new PeliculaDTO();
                pelicula.setId(resultSet.getInt("id"));
                pelicula.setTitulo(resultSet.getString("titulo"));
                pelicula.setDirector(resultSet.getString("director"));
                pelicula.setAnio(resultSet.getInt("anio"));
                pelicula.setDuracion(resultSet.getInt("duracion"));
                pelicula.setGenero(resultSet.getString("genero"));

                peliculas.add(pelicula);
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener las películas: " + ex.getMessage());
    }

    return peliculas;
    }
    
    
    
    
    
    
    
    public void modificarPelicula(PeliculaDTO peliculaDTO) {
        // Implementación para modificar una película...
    }

    public void eliminarPelicula(int idPelicula) {
     try {
        String sqlDelete = "DELETE FROM MOVIE WHERE id = ?";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(sqlDelete)) {
            preparedStatement.setInt(1, idPelicula);

            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Película eliminada con éxito");
            } else {
                System.out.println("No se encontró película con dicho ID");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error al eliminar la película: " + ex.getMessage());
    }   // Implementación para eliminar una película...
    }

    // Otros métodos según sea necesario...
}
  
    

