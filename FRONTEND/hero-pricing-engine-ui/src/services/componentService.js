import api from "../api/api";

export const getAllComponents=()=>{

    return api.get("/components");

}

export const getComponent=(id)=>{

    return api.get(`/components/${id}`);

}

export const addComponent=(component)=>{

    return api.post("/components",component);

}

export const updateComponent=(id,component)=>{

    return api.put(`/components/${id}`,component);

}

export const deleteComponent=(id)=>{

    return api.delete(`/components/${id}`);

}

export const updatePrice=(id,price)=>{

    return api.patch(`/components/${id}/price?price=${price}`);

}