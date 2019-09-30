import com.ronaldarias.apirest.models.dao.ProductoDAO;
import com.ronaldarias.apirest.models.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {

	// need to inject customer DAO
	@Autowired
	private ProductoDAO productoDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Producto> getProducto() {
		return (List<Producto>) productoDAO.findAll();
	}

	@Override
	@Transactional
	public void saveProducto(Producto theProducto) {

		productoDAO.save(theProducto);
	}

	@Override
	@Transactional(readOnly=true)
	public Producto getProducto(Integer theId) {

		return productoDAO.findById(theId).get();
	}

	@Override
	@Transactional
	public void deleteProducto(Integer theId) {
		productoDAO.deleteById(theId);
	}

}
