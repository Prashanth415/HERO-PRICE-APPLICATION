import { useEffect, useState } from "react";
import {
  getAllComponents,
  deleteComponent,
} from "../services/componentService";
import ComponentForm from "../components/ComponentForm";

function Components() {
  const [components, setComponents] = useState([]);
  const [selectedComponent, setSelectedComponent] = useState(null);

  const loadComponents = () => {
    getAllComponents()
      .then((res) => setComponents(res.data))
      .catch((err) => console.error(err));
  };

  useEffect(() => {
    loadComponents();
  }, []);

  const handleDelete = (id) => {
    if (window.confirm("Delete this component?")) {
      deleteComponent(id).then(() => loadComponents());
    }
  };

  return (
    <div className="container mt-4">

      <h2>Component Management</h2>

      <ComponentForm
        loadComponents={loadComponents}
        selectedComponent={selectedComponent}
        setSelectedComponent={setSelectedComponent}
      />

      <table className="table table-bordered table-hover mt-4">

        <thead className="table-dark">

          <tr>

            <th>ID</th>

            <th>Name</th>

            <th>Category</th>

            <th>Price</th>

            <th>Status</th>

            <th>Actions</th>

          </tr>

        </thead>

        <tbody>

          {components.map((component) => (

            <tr key={component.componentId}>

              <td>{component.componentId}</td>

              <td>{component.name}</td>

              <td>{component.category}</td>

              <td>₹ {component.currentPrice}</td>

              <td>
                {component.active ? "Active" : "Inactive"}
              </td>

              <td>

                <button
                  className="btn btn-warning btn-sm me-2"
                  onClick={() => setSelectedComponent(component)}
                >
                  Edit
                </button>

                <button
                  className="btn btn-danger btn-sm"
                  onClick={() =>
                    handleDelete(component.componentId)
                  }
                >
                  Delete
                </button>

              </td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>
  );
}

export default Components;